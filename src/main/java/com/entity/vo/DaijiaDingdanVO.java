package com.entity.vo;

import com.entity.DaijiaDingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 代驾订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("daijia_dingdan")
public class DaijiaDingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 司机
     */

    @TableField(value = "siji_id")
    private Integer sijiId;


    /**
     * 订单编号
     */

    @TableField(value = "daijia_dingdan_uuid_number")
    private String daijiaDingdanUuidNumber;


    /**
     * 出发位置
     */

    @TableField(value = "daijia_dingdan_chufa_address")
    private String daijiaDingdanChufaAddress;


    /**
     * 前往位置
     */

    @TableField(value = "daijia_dingdan_qianwang_address")
    private String daijiaDingdanQianwangAddress;


    /**
     * 车辆颜色
     */

    @TableField(value = "daijia_dingdan_yanse")
    private String daijiaDingdanYanse;


    /**
     * 车子品牌
     */

    @TableField(value = "daijia_dingdan_pinpai")
    private String daijiaDingdanPinpai;


    /**
     * 车辆照片
     */

    @TableField(value = "daijia_dingdan_photo")
    private String daijiaDingdanPhoto;


    /**
     * 车牌号
     */

    @TableField(value = "daijia_dingdan_chepaihao")
    private String daijiaDingdanChepaihao;


    /**
     * 联系人姓名
     */

    @TableField(value = "daijia_dingdan_lianxiren")
    private String daijiaDingdanLianxiren;


    /**
     * 联系电话
     */

    @TableField(value = "daijia_dingdan_phone")
    private String daijiaDingdanPhone;


    /**
     * 出价
     */

    @TableField(value = "daijia_dingdan_jine")
    private Double daijiaDingdanJine;


    /**
     * 下单时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 备注
     */

    @TableField(value = "daijia_dingdan_content")
    private String daijiaDingdanContent;


    /**
     * 订单状态
     */

    @TableField(value = "daijia_dingdan_types")
    private Integer daijiaDingdanTypes;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：司机
	 */
    public Integer getSijiId() {
        return sijiId;
    }


    /**
	 * 获取：司机
	 */

    public void setSijiId(Integer sijiId) {
        this.sijiId = sijiId;
    }
    /**
	 * 设置：订单编号
	 */
    public String getDaijiaDingdanUuidNumber() {
        return daijiaDingdanUuidNumber;
    }


    /**
	 * 获取：订单编号
	 */

    public void setDaijiaDingdanUuidNumber(String daijiaDingdanUuidNumber) {
        this.daijiaDingdanUuidNumber = daijiaDingdanUuidNumber;
    }
    /**
	 * 设置：出发位置
	 */
    public String getDaijiaDingdanChufaAddress() {
        return daijiaDingdanChufaAddress;
    }


    /**
	 * 获取：出发位置
	 */

    public void setDaijiaDingdanChufaAddress(String daijiaDingdanChufaAddress) {
        this.daijiaDingdanChufaAddress = daijiaDingdanChufaAddress;
    }
    /**
	 * 设置：前往位置
	 */
    public String getDaijiaDingdanQianwangAddress() {
        return daijiaDingdanQianwangAddress;
    }


    /**
	 * 获取：前往位置
	 */

    public void setDaijiaDingdanQianwangAddress(String daijiaDingdanQianwangAddress) {
        this.daijiaDingdanQianwangAddress = daijiaDingdanQianwangAddress;
    }
    /**
	 * 设置：车辆颜色
	 */
    public String getDaijiaDingdanYanse() {
        return daijiaDingdanYanse;
    }


    /**
	 * 获取：车辆颜色
	 */

    public void setDaijiaDingdanYanse(String daijiaDingdanYanse) {
        this.daijiaDingdanYanse = daijiaDingdanYanse;
    }
    /**
	 * 设置：车子品牌
	 */
    public String getDaijiaDingdanPinpai() {
        return daijiaDingdanPinpai;
    }


    /**
	 * 获取：车子品牌
	 */

    public void setDaijiaDingdanPinpai(String daijiaDingdanPinpai) {
        this.daijiaDingdanPinpai = daijiaDingdanPinpai;
    }
    /**
	 * 设置：车辆照片
	 */
    public String getDaijiaDingdanPhoto() {
        return daijiaDingdanPhoto;
    }


    /**
	 * 获取：车辆照片
	 */

    public void setDaijiaDingdanPhoto(String daijiaDingdanPhoto) {
        this.daijiaDingdanPhoto = daijiaDingdanPhoto;
    }
    /**
	 * 设置：车牌号
	 */
    public String getDaijiaDingdanChepaihao() {
        return daijiaDingdanChepaihao;
    }


    /**
	 * 获取：车牌号
	 */

    public void setDaijiaDingdanChepaihao(String daijiaDingdanChepaihao) {
        this.daijiaDingdanChepaihao = daijiaDingdanChepaihao;
    }
    /**
	 * 设置：联系人姓名
	 */
    public String getDaijiaDingdanLianxiren() {
        return daijiaDingdanLianxiren;
    }


    /**
	 * 获取：联系人姓名
	 */

    public void setDaijiaDingdanLianxiren(String daijiaDingdanLianxiren) {
        this.daijiaDingdanLianxiren = daijiaDingdanLianxiren;
    }
    /**
	 * 设置：联系电话
	 */
    public String getDaijiaDingdanPhone() {
        return daijiaDingdanPhone;
    }


    /**
	 * 获取：联系电话
	 */

    public void setDaijiaDingdanPhone(String daijiaDingdanPhone) {
        this.daijiaDingdanPhone = daijiaDingdanPhone;
    }
    /**
	 * 设置：出价
	 */
    public Double getDaijiaDingdanJine() {
        return daijiaDingdanJine;
    }


    /**
	 * 获取：出价
	 */

    public void setDaijiaDingdanJine(Double daijiaDingdanJine) {
        this.daijiaDingdanJine = daijiaDingdanJine;
    }
    /**
	 * 设置：下单时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：下单时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：备注
	 */
    public String getDaijiaDingdanContent() {
        return daijiaDingdanContent;
    }


    /**
	 * 获取：备注
	 */

    public void setDaijiaDingdanContent(String daijiaDingdanContent) {
        this.daijiaDingdanContent = daijiaDingdanContent;
    }
    /**
	 * 设置：订单状态
	 */
    public Integer getDaijiaDingdanTypes() {
        return daijiaDingdanTypes;
    }


    /**
	 * 获取：订单状态
	 */

    public void setDaijiaDingdanTypes(Integer daijiaDingdanTypes) {
        this.daijiaDingdanTypes = daijiaDingdanTypes;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
