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
 * 代驾订单
 *
 * @author 
 * @email
 */
@TableName("daijia_dingdan")
public class DaijiaDingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaijiaDingdanEntity() {

	}

	public DaijiaDingdanEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 司机
     */
    @ColumnInfo(comment="司机",type="int(11)")
    @TableField(value = "siji_id")

    private Integer sijiId;


    /**
     * 订单编号
     */
    @ColumnInfo(comment="订单编号",type="varchar(200)")
    @TableField(value = "daijia_dingdan_uuid_number")

    private String daijiaDingdanUuidNumber;


    /**
     * 出发位置
     */
    @ColumnInfo(comment="出发位置",type="varchar(200)")
    @TableField(value = "daijia_dingdan_chufa_address")

    private String daijiaDingdanChufaAddress;


    /**
     * 前往位置
     */
    @ColumnInfo(comment="前往位置",type="varchar(200)")
    @TableField(value = "daijia_dingdan_qianwang_address")

    private String daijiaDingdanQianwangAddress;


    /**
     * 车辆颜色
     */
    @ColumnInfo(comment="车辆颜色",type="varchar(200)")
    @TableField(value = "daijia_dingdan_yanse")

    private String daijiaDingdanYanse;


    /**
     * 车子品牌
     */
    @ColumnInfo(comment="车子品牌",type="varchar(200)")
    @TableField(value = "daijia_dingdan_pinpai")

    private String daijiaDingdanPinpai;


    /**
     * 车辆照片
     */
    @ColumnInfo(comment="车辆照片",type="varchar(200)")
    @TableField(value = "daijia_dingdan_photo")

    private String daijiaDingdanPhoto;


    /**
     * 车牌号
     */
    @ColumnInfo(comment="车牌号",type="varchar(200)")
    @TableField(value = "daijia_dingdan_chepaihao")

    private String daijiaDingdanChepaihao;


    /**
     * 联系人姓名
     */
    @ColumnInfo(comment="联系人姓名",type="varchar(200)")
    @TableField(value = "daijia_dingdan_lianxiren")

    private String daijiaDingdanLianxiren;


    /**
     * 联系电话
     */
    @ColumnInfo(comment="联系电话",type="varchar(200)")
    @TableField(value = "daijia_dingdan_phone")

    private String daijiaDingdanPhone;


    /**
     * 出价
     */
    @ColumnInfo(comment="出价",type="decimal(10,2)")
    @TableField(value = "daijia_dingdan_jine")

    private Double daijiaDingdanJine;


    /**
     * 下单时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="下单时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "daijia_dingdan_content")

    private String daijiaDingdanContent;


    /**
     * 订单状态
     */
    @ColumnInfo(comment="订单状态",type="int(11)")
    @TableField(value = "daijia_dingdan_types")

    private Integer daijiaDingdanTypes;


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
	 * 获取：司机
	 */
    public Integer getSijiId() {
        return sijiId;
    }
    /**
	 * 设置：司机
	 */

    public void setSijiId(Integer sijiId) {
        this.sijiId = sijiId;
    }
    /**
	 * 获取：订单编号
	 */
    public String getDaijiaDingdanUuidNumber() {
        return daijiaDingdanUuidNumber;
    }
    /**
	 * 设置：订单编号
	 */

    public void setDaijiaDingdanUuidNumber(String daijiaDingdanUuidNumber) {
        this.daijiaDingdanUuidNumber = daijiaDingdanUuidNumber;
    }
    /**
	 * 获取：出发位置
	 */
    public String getDaijiaDingdanChufaAddress() {
        return daijiaDingdanChufaAddress;
    }
    /**
	 * 设置：出发位置
	 */

    public void setDaijiaDingdanChufaAddress(String daijiaDingdanChufaAddress) {
        this.daijiaDingdanChufaAddress = daijiaDingdanChufaAddress;
    }
    /**
	 * 获取：前往位置
	 */
    public String getDaijiaDingdanQianwangAddress() {
        return daijiaDingdanQianwangAddress;
    }
    /**
	 * 设置：前往位置
	 */

    public void setDaijiaDingdanQianwangAddress(String daijiaDingdanQianwangAddress) {
        this.daijiaDingdanQianwangAddress = daijiaDingdanQianwangAddress;
    }
    /**
	 * 获取：车辆颜色
	 */
    public String getDaijiaDingdanYanse() {
        return daijiaDingdanYanse;
    }
    /**
	 * 设置：车辆颜色
	 */

    public void setDaijiaDingdanYanse(String daijiaDingdanYanse) {
        this.daijiaDingdanYanse = daijiaDingdanYanse;
    }
    /**
	 * 获取：车子品牌
	 */
    public String getDaijiaDingdanPinpai() {
        return daijiaDingdanPinpai;
    }
    /**
	 * 设置：车子品牌
	 */

    public void setDaijiaDingdanPinpai(String daijiaDingdanPinpai) {
        this.daijiaDingdanPinpai = daijiaDingdanPinpai;
    }
    /**
	 * 获取：车辆照片
	 */
    public String getDaijiaDingdanPhoto() {
        return daijiaDingdanPhoto;
    }
    /**
	 * 设置：车辆照片
	 */

    public void setDaijiaDingdanPhoto(String daijiaDingdanPhoto) {
        this.daijiaDingdanPhoto = daijiaDingdanPhoto;
    }
    /**
	 * 获取：车牌号
	 */
    public String getDaijiaDingdanChepaihao() {
        return daijiaDingdanChepaihao;
    }
    /**
	 * 设置：车牌号
	 */

    public void setDaijiaDingdanChepaihao(String daijiaDingdanChepaihao) {
        this.daijiaDingdanChepaihao = daijiaDingdanChepaihao;
    }
    /**
	 * 获取：联系人姓名
	 */
    public String getDaijiaDingdanLianxiren() {
        return daijiaDingdanLianxiren;
    }
    /**
	 * 设置：联系人姓名
	 */

    public void setDaijiaDingdanLianxiren(String daijiaDingdanLianxiren) {
        this.daijiaDingdanLianxiren = daijiaDingdanLianxiren;
    }
    /**
	 * 获取：联系电话
	 */
    public String getDaijiaDingdanPhone() {
        return daijiaDingdanPhone;
    }
    /**
	 * 设置：联系电话
	 */

    public void setDaijiaDingdanPhone(String daijiaDingdanPhone) {
        this.daijiaDingdanPhone = daijiaDingdanPhone;
    }
    /**
	 * 获取：出价
	 */
    public Double getDaijiaDingdanJine() {
        return daijiaDingdanJine;
    }
    /**
	 * 设置：出价
	 */

    public void setDaijiaDingdanJine(Double daijiaDingdanJine) {
        this.daijiaDingdanJine = daijiaDingdanJine;
    }
    /**
	 * 获取：下单时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：下单时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：备注
	 */
    public String getDaijiaDingdanContent() {
        return daijiaDingdanContent;
    }
    /**
	 * 设置：备注
	 */

    public void setDaijiaDingdanContent(String daijiaDingdanContent) {
        this.daijiaDingdanContent = daijiaDingdanContent;
    }
    /**
	 * 获取：订单状态
	 */
    public Integer getDaijiaDingdanTypes() {
        return daijiaDingdanTypes;
    }
    /**
	 * 设置：订单状态
	 */

    public void setDaijiaDingdanTypes(Integer daijiaDingdanTypes) {
        this.daijiaDingdanTypes = daijiaDingdanTypes;
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
        return "DaijiaDingdan{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", sijiId=" + sijiId +
            ", daijiaDingdanUuidNumber=" + daijiaDingdanUuidNumber +
            ", daijiaDingdanChufaAddress=" + daijiaDingdanChufaAddress +
            ", daijiaDingdanQianwangAddress=" + daijiaDingdanQianwangAddress +
            ", daijiaDingdanYanse=" + daijiaDingdanYanse +
            ", daijiaDingdanPinpai=" + daijiaDingdanPinpai +
            ", daijiaDingdanPhoto=" + daijiaDingdanPhoto +
            ", daijiaDingdanChepaihao=" + daijiaDingdanChepaihao +
            ", daijiaDingdanLianxiren=" + daijiaDingdanLianxiren +
            ", daijiaDingdanPhone=" + daijiaDingdanPhone +
            ", daijiaDingdanJine=" + daijiaDingdanJine +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", daijiaDingdanContent=" + daijiaDingdanContent +
            ", daijiaDingdanTypes=" + daijiaDingdanTypes +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
