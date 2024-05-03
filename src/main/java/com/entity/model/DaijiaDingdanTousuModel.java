package com.entity.model;

import com.entity.DaijiaDingdanTousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 代驾订单投诉
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DaijiaDingdanTousuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 代驾订单
     */
    private Integer daijiaDingdanId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 附件
     */
    private String daijiaDingdanTousuFile;


    /**
     * 投诉内容
     */
    private String daijiaDingdanTousuContent;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 回复内容
     */
    private String daijiaDingdanHuifuContent;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：代驾订单
	 */
    public Integer getDaijiaDingdanId() {
        return daijiaDingdanId;
    }


    /**
	 * 设置：代驾订单
	 */
    public void setDaijiaDingdanId(Integer daijiaDingdanId) {
        this.daijiaDingdanId = daijiaDingdanId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：附件
	 */
    public String getDaijiaDingdanTousuFile() {
        return daijiaDingdanTousuFile;
    }


    /**
	 * 设置：附件
	 */
    public void setDaijiaDingdanTousuFile(String daijiaDingdanTousuFile) {
        this.daijiaDingdanTousuFile = daijiaDingdanTousuFile;
    }
    /**
	 * 获取：投诉内容
	 */
    public String getDaijiaDingdanTousuContent() {
        return daijiaDingdanTousuContent;
    }


    /**
	 * 设置：投诉内容
	 */
    public void setDaijiaDingdanTousuContent(String daijiaDingdanTousuContent) {
        this.daijiaDingdanTousuContent = daijiaDingdanTousuContent;
    }
    /**
	 * 获取：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：投诉时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：回复内容
	 */
    public String getDaijiaDingdanHuifuContent() {
        return daijiaDingdanHuifuContent;
    }


    /**
	 * 设置：回复内容
	 */
    public void setDaijiaDingdanHuifuContent(String daijiaDingdanHuifuContent) {
        this.daijiaDingdanHuifuContent = daijiaDingdanHuifuContent;
    }
    /**
	 * 获取：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 设置：回复时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
