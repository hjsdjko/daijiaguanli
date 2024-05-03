package com.entity.model;

import com.entity.DaijiaDingdanCommentbackEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 代驾订单评价
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DaijiaDingdanCommentbackModel implements Serializable {
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
     * 评分
     */
    private Integer daijiaDingdanCommentbackPingfenNumber;


    /**
     * 评价内容
     */
    private String daijiaDingdanCommentbackText;


    /**
     * 评价时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：评分
	 */
    public Integer getDaijiaDingdanCommentbackPingfenNumber() {
        return daijiaDingdanCommentbackPingfenNumber;
    }


    /**
	 * 设置：评分
	 */
    public void setDaijiaDingdanCommentbackPingfenNumber(Integer daijiaDingdanCommentbackPingfenNumber) {
        this.daijiaDingdanCommentbackPingfenNumber = daijiaDingdanCommentbackPingfenNumber;
    }
    /**
	 * 获取：评价内容
	 */
    public String getDaijiaDingdanCommentbackText() {
        return daijiaDingdanCommentbackText;
    }


    /**
	 * 设置：评价内容
	 */
    public void setDaijiaDingdanCommentbackText(String daijiaDingdanCommentbackText) {
        this.daijiaDingdanCommentbackText = daijiaDingdanCommentbackText;
    }
    /**
	 * 获取：评价时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：评价时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
