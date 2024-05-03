
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 代驾订单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/daijiaDingdan")
public class DaijiaDingdanController {
    private static final Logger logger = LoggerFactory.getLogger(DaijiaDingdanController.class);

    private static final String TABLE_NAME = "daijiaDingdan";

    @Autowired
    private DaijiaDingdanService daijiaDingdanService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DaijiaDingdanChatService daijiaDingdanChatService;//用户咨询
    @Autowired
    private DaijiaDingdanCommentbackService daijiaDingdanCommentbackService;//代驾订单评价
    @Autowired
    private DaijiaDingdanTousuService daijiaDingdanTousuService;//代驾订单投诉
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private NewsService newsService;//新闻信息
    @Autowired
    private SijiService sijiService;//司机
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("司机".equals(role))
            params.put("sijiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = daijiaDingdanService.queryPage(params);

        //字典表数据转换
        List<DaijiaDingdanView> list =(List<DaijiaDingdanView>)page.getList();
        for(DaijiaDingdanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DaijiaDingdanEntity daijiaDingdan = daijiaDingdanService.selectById(id);
        if(daijiaDingdan !=null){
            //entity转view
            DaijiaDingdanView view = new DaijiaDingdanView();
            BeanUtils.copyProperties( daijiaDingdan , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(daijiaDingdan.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"
, "sijiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //级联表 司机
            //级联表
            SijiEntity siji = sijiService.selectById(daijiaDingdan.getSijiId());
            if(siji != null){
            BeanUtils.copyProperties( siji , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"
, "sijiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setSijiId(siji.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DaijiaDingdanEntity daijiaDingdan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,daijiaDingdan:{}",this.getClass().getName(),daijiaDingdan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            daijiaDingdan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        else if("司机".equals(role))
            daijiaDingdan.setSijiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<DaijiaDingdanEntity> queryWrapper = new EntityWrapper<DaijiaDingdanEntity>()
            .eq("yonghu_id", daijiaDingdan.getYonghuId())
            .eq("siji_id", daijiaDingdan.getSijiId())
            .eq("daijia_dingdan_chufa_address", daijiaDingdan.getDaijiaDingdanChufaAddress())
            .eq("daijia_dingdan_qianwang_address", daijiaDingdan.getDaijiaDingdanQianwangAddress())
            .eq("daijia_dingdan_yanse", daijiaDingdan.getDaijiaDingdanYanse())
            .eq("daijia_dingdan_pinpai", daijiaDingdan.getDaijiaDingdanPinpai())
            .eq("daijia_dingdan_chepaihao", daijiaDingdan.getDaijiaDingdanChepaihao())
            .eq("daijia_dingdan_lianxiren", daijiaDingdan.getDaijiaDingdanLianxiren())
            .eq("daijia_dingdan_phone", daijiaDingdan.getDaijiaDingdanPhone())
            .eq("daijia_dingdan_types", daijiaDingdan.getDaijiaDingdanTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DaijiaDingdanEntity daijiaDingdanEntity = daijiaDingdanService.selectOne(queryWrapper);
        if(daijiaDingdanEntity==null){
            daijiaDingdan.setInsertTime(new Date());
            daijiaDingdan.setCreateTime(new Date());
            daijiaDingdanService.insert(daijiaDingdan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DaijiaDingdanEntity daijiaDingdan, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,daijiaDingdan:{}",this.getClass().getName(),daijiaDingdan.toString());
        DaijiaDingdanEntity oldDaijiaDingdanEntity = daijiaDingdanService.selectById(daijiaDingdan.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            daijiaDingdan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
//        else if("司机".equals(role))
//            daijiaDingdan.setSijiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(daijiaDingdan.getDaijiaDingdanPhoto()) || "null".equals(daijiaDingdan.getDaijiaDingdanPhoto())){
                daijiaDingdan.setDaijiaDingdanPhoto(null);
        }

            daijiaDingdanService.updateById(daijiaDingdan);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<DaijiaDingdanEntity> oldDaijiaDingdanList =daijiaDingdanService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        daijiaDingdanService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<DaijiaDingdanEntity> daijiaDingdanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            DaijiaDingdanEntity daijiaDingdanEntity = new DaijiaDingdanEntity();
//                            daijiaDingdanEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            daijiaDingdanEntity.setSijiId(Integer.valueOf(data.get(0)));   //司机 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanUuidNumber(data.get(0));                    //订单编号 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanChufaAddress(data.get(0));                    //出发位置 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanQianwangAddress(data.get(0));                    //前往位置 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanYanse(data.get(0));                    //车辆颜色 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanPinpai(data.get(0));                    //车子品牌 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanPhoto("");//详情和图片
//                            daijiaDingdanEntity.setDaijiaDingdanChepaihao(data.get(0));                    //车牌号 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanLianxiren(data.get(0));                    //联系人姓名 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanPhone(data.get(0));                    //联系电话 要改的
//                            daijiaDingdanEntity.setDaijiaDingdanJine(data.get(0));                    //出价 要改的
//                            daijiaDingdanEntity.setInsertTime(date);//时间
//                            daijiaDingdanEntity.setDaijiaDingdanContent("");//详情和图片
//                            daijiaDingdanEntity.setDaijiaDingdanTypes(Integer.valueOf(data.get(0)));   //订单状态 要改的
//                            daijiaDingdanEntity.setCreateTime(date);//时间
                            daijiaDingdanList.add(daijiaDingdanEntity);


                            //把要查询是否重复的字段放入map中
                                //订单编号
                                if(seachFields.containsKey("daijiaDingdanUuidNumber")){
                                    List<String> daijiaDingdanUuidNumber = seachFields.get("daijiaDingdanUuidNumber");
                                    daijiaDingdanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> daijiaDingdanUuidNumber = new ArrayList<>();
                                    daijiaDingdanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("daijiaDingdanUuidNumber",daijiaDingdanUuidNumber);
                                }
                                //联系电话
                                if(seachFields.containsKey("daijiaDingdanPhone")){
                                    List<String> daijiaDingdanPhone = seachFields.get("daijiaDingdanPhone");
                                    daijiaDingdanPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> daijiaDingdanPhone = new ArrayList<>();
                                    daijiaDingdanPhone.add(data.get(0));//要改的
                                    seachFields.put("daijiaDingdanPhone",daijiaDingdanPhone);
                                }
                        }

                        //查询是否重复
                         //订单编号
                        List<DaijiaDingdanEntity> daijiaDingdanEntities_daijiaDingdanUuidNumber = daijiaDingdanService.selectList(new EntityWrapper<DaijiaDingdanEntity>().in("daijia_dingdan_uuid_number", seachFields.get("daijiaDingdanUuidNumber")));
                        if(daijiaDingdanEntities_daijiaDingdanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DaijiaDingdanEntity s:daijiaDingdanEntities_daijiaDingdanUuidNumber){
                                repeatFields.add(s.getDaijiaDingdanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [订单编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //联系电话
                        List<DaijiaDingdanEntity> daijiaDingdanEntities_daijiaDingdanPhone = daijiaDingdanService.selectList(new EntityWrapper<DaijiaDingdanEntity>().in("daijia_dingdan_phone", seachFields.get("daijiaDingdanPhone")));
                        if(daijiaDingdanEntities_daijiaDingdanPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DaijiaDingdanEntity s:daijiaDingdanEntities_daijiaDingdanPhone){
                                repeatFields.add(s.getDaijiaDingdanPhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系电话] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        daijiaDingdanService.insertBatch(daijiaDingdanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = daijiaDingdanService.queryPage(params);

        //字典表数据转换
        List<DaijiaDingdanView> list =(List<DaijiaDingdanView>)page.getList();
        for(DaijiaDingdanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DaijiaDingdanEntity daijiaDingdan = daijiaDingdanService.selectById(id);
            if(daijiaDingdan !=null){


                //entity转view
                DaijiaDingdanView view = new DaijiaDingdanView();
                BeanUtils.copyProperties( daijiaDingdan , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(daijiaDingdan.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //级联表
                    SijiEntity siji = sijiService.selectById(daijiaDingdan.getSijiId());
                if(siji != null){
                    BeanUtils.copyProperties( siji , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setSijiId(siji.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody DaijiaDingdanEntity daijiaDingdan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,daijiaDingdan:{}",this.getClass().getName(),daijiaDingdan.toString());

        Integer userId = (Integer) request.getSession().getAttribute("userId");
        YonghuEntity yonghuEntity = yonghuService.selectById(userId);
        if(yonghuEntity == null)
            return R.error(511,"用户不能为空");
        if(yonghuEntity.getNewMoney() == null)
            return R.error(511,"用户金额不能为空");

        double balance = yonghuEntity.getNewMoney() - daijiaDingdan.getDaijiaDingdanJine();
        if(balance<0){
            return R.error("用户金额不够支付,请核实");
        }
        yonghuEntity.setNewMoney(balance);
        yonghuService.updateById(yonghuEntity);
        daijiaDingdan.setDaijiaDingdanTypes(101);
        daijiaDingdan.setInsertTime(new Date());
            daijiaDingdan.setCreateTime(new Date());
        daijiaDingdanService.insert(daijiaDingdan);

            return R.ok();
    }

    /**
    * 取消订单
    */
    @RequestMapping("/refund")
    public R refund(Integer id, HttpServletRequest request){
        logger.debug("refund方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        String role = String.valueOf(request.getSession().getAttribute("role"));

            DaijiaDingdanEntity daijiaDingdan = daijiaDingdanService.selectById(id);//当前表service


            Integer userId = (Integer) request.getSession().getAttribute("userId");
            YonghuEntity yonghuEntity = yonghuService.selectById(userId);
            if(yonghuEntity == null)
                return R.error(511,"用户不能为空");
            if(yonghuEntity.getNewMoney() == null)
            return R.error(511,"用户金额不能为空");

            yonghuEntity.setNewMoney(yonghuEntity.getNewMoney() + daijiaDingdan.getDaijiaDingdanJine()); //设置金额
            daijiaDingdan.setDaijiaDingdanTypes(102);//设置订单状态为已取消订单
            daijiaDingdanService.updateAllColumnById(daijiaDingdan);//根据id更新
            yonghuService.updateById(yonghuEntity);//更新用户信息

            return R.ok();
    }

    /**
     * 接单
     */
    @RequestMapping("/deliver")
    public R deliver(Integer id  , HttpServletRequest request){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        DaijiaDingdanEntity  daijiaDingdanEntity = daijiaDingdanService.selectById(id);
        Integer sijiId = (Integer) request.getSession().getAttribute("userId");
        daijiaDingdanEntity.setDaijiaDingdanTypes(103);//设置订单状态为已接单
        daijiaDingdanEntity.setSijiId(sijiId);

        SijiEntity sijiEntity = sijiService.selectById(sijiId);
        if(sijiEntity == null)
            return R.error("查不到司机");
        sijiEntity.setNewMoney( sijiEntity.getNewMoney() + daijiaDingdanEntity.getDaijiaDingdanJine());

        sijiService.updateById(sijiEntity);
        daijiaDingdanService.updateById( daijiaDingdanEntity);

        return R.ok();
    }


    /**
     * 上车
     */
    @RequestMapping("/receiving")
    public R receiving(Integer id , HttpServletRequest request){
        logger.debug("refund:,,Controller:{},,ids:{}",this.getClass().getName(),id.toString());
        DaijiaDingdanEntity  daijiaDingdanEntity = daijiaDingdanService.selectById(id);
        daijiaDingdanEntity.setDaijiaDingdanTypes(104);//设置订单状态为上车
        daijiaDingdanService.updateById( daijiaDingdanEntity);
        return R.ok();
    }


    /**
     * 评价
     */
    @RequestMapping("/commentback")
    public R commentback(Integer id, String commentbackText, Integer CommentbackPingfenNumber, HttpServletRequest request){
        logger.debug("commentback方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DaijiaDingdanEntity  daijiaDingdanEntity = daijiaDingdanService.selectById(id);
        if(daijiaDingdanEntity == null)
            return R.error(511,"查不到该订单");
        DaijiaDingdanCommentbackEntity pingjia = new DaijiaDingdanCommentbackEntity();
        pingjia.setCreateTime(new Date());
        pingjia.setInsertTime(new Date());
        pingjia.setDaijiaDingdanId(daijiaDingdanEntity.getId());
        pingjia.setYonghuId(daijiaDingdanEntity.getYonghuId());
        pingjia.setDaijiaDingdanCommentbackText(commentbackText);
        pingjia.setDaijiaDingdanCommentbackPingfenNumber(CommentbackPingfenNumber);
        daijiaDingdanCommentbackService.insert(pingjia);
        daijiaDingdanEntity.setDaijiaDingdanTypes(105);
        daijiaDingdanService.updateById(daijiaDingdanEntity);


        return R.ok();
    }

}

