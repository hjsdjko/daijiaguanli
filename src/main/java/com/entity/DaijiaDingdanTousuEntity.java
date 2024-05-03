package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 代驾订单投诉
 *
 * @author 
 * @email
 */
@TableName("daijia_dingdan_tousu")
public class DaijiaDingdanTousuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaijiaDingdanTousuEntity() {

	}

	public DaijiaDingdanTousuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 代驾订单
     */
    @ColumnInfo(comment="代驾订单",type="int(11)")
    @TableField(value = "daijia_dingdan_id")

    private Integer daijiaDingdanId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "daijia_dingdan_tousu_file")

    private String daijiaDingdanTousuFile;


    /**
     * 投诉内容
     */
    @ColumnInfo(comment="投诉内容",type="longtext")
    @TableField(value = "daijia_dingdan_tousu_content")

    private String daijiaDingdanTousuContent;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="投诉时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 回复内容
     */
    @ColumnInfo(comment="回复内容",type="longtext")
    @TableField(value = "daijia_dingdan_huifu_content")

    private String daijiaDingdanHuifuContent;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="回复时间",type="timestamp")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DaijiaDingdanTousu{" +
            ", id=" + id +
            ", daijiaDingdanId=" + daijiaDingdanId +
            ", yonghuId=" + yonghuId +
            ", daijiaDingdanTousuFile=" + daijiaDingdanTousuFile +
            ", daijiaDingdanTousuContent=" + daijiaDingdanTousuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", daijiaDingdanHuifuContent=" + daijiaDingdanHuifuContent +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
