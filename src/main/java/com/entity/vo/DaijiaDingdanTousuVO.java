package com.entity.vo;

import com.entity.DaijiaDingdanTousuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 代驾订单投诉
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("daijia_dingdan_tousu")
public class DaijiaDingdanTousuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 代驾订单
     */

    @TableField(value = "daijia_dingdan_id")
    private Integer daijiaDingdanId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 附件
     */

    @TableField(value = "daijia_dingdan_tousu_file")
    private String daijiaDingdanTousuFile;


    /**
     * 投诉内容
     */

    @TableField(value = "daijia_dingdan_tousu_content")
    private String daijiaDingdanTousuContent;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 回复内容
     */

    @TableField(value = "daijia_dingdan_huifu_content")
    private String daijiaDingdanHuifuContent;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


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
	 * 设置：代驾订单
	 */
    public Integer getDaijiaDingdanId() {
        return daijiaDingdanId;
    }


    /**
	 * 获取：代驾订单
	 */

    public void setDaijiaDingdanId(Integer daijiaDingdanId) {
        this.daijiaDingdanId = daijiaDingdanId;
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
	 * 设置：附件
	 */
    public String getDaijiaDingdanTousuFile() {
        return daijiaDingdanTousuFile;
    }


    /**
	 * 获取：附件
	 */

    public void setDaijiaDingdanTousuFile(String daijiaDingdanTousuFile) {
        this.daijiaDingdanTousuFile = daijiaDingdanTousuFile;
    }
    /**
	 * 设置：投诉内容
	 */
    public String getDaijiaDingdanTousuContent() {
        return daijiaDingdanTousuContent;
    }


    /**
	 * 获取：投诉内容
	 */

    public void setDaijiaDingdanTousuContent(String daijiaDingdanTousuContent) {
        this.daijiaDingdanTousuContent = daijiaDingdanTousuContent;
    }
    /**
	 * 设置：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：投诉时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：回复内容
	 */
    public String getDaijiaDingdanHuifuContent() {
        return daijiaDingdanHuifuContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setDaijiaDingdanHuifuContent(String daijiaDingdanHuifuContent) {
        this.daijiaDingdanHuifuContent = daijiaDingdanHuifuContent;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
