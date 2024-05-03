package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DaijiaDingdanCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 代驾订单评价
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("daijia_dingdan_commentback")
public class DaijiaDingdanCommentbackView extends DaijiaDingdanCommentbackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 代驾订单
					 
		/**
		* 代驾订单 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer daijiaDingdanYonghuId;
					 
		/**
		* 代驾订单 的 司机
		*/
		@ColumnInfo(comment="司机",type="int(11)")
		private Integer daijiaDingdanSijiId;
		/**
		* 订单编号
		*/

		@ColumnInfo(comment="订单编号",type="varchar(200)")
		private String daijiaDingdanUuidNumber;
		/**
		* 出发位置
		*/

		@ColumnInfo(comment="出发位置",type="varchar(200)")
		private String daijiaDingdanChufaAddress;
		/**
		* 前往位置
		*/

		@ColumnInfo(comment="前往位置",type="varchar(200)")
		private String daijiaDingdanQianwangAddress;
		/**
		* 车辆颜色
		*/

		@ColumnInfo(comment="车辆颜色",type="varchar(200)")
		private String daijiaDingdanYanse;
		/**
		* 车子品牌
		*/

		@ColumnInfo(comment="车子品牌",type="varchar(200)")
		private String daijiaDingdanPinpai;
		/**
		* 车辆照片
		*/

		@ColumnInfo(comment="车辆照片",type="varchar(200)")
		private String daijiaDingdanPhoto;
		/**
		* 车牌号
		*/

		@ColumnInfo(comment="车牌号",type="varchar(200)")
		private String daijiaDingdanChepaihao;
		/**
		* 联系人姓名
		*/

		@ColumnInfo(comment="联系人姓名",type="varchar(200)")
		private String daijiaDingdanLianxiren;
		/**
		* 联系电话
		*/

		@ColumnInfo(comment="联系电话",type="varchar(200)")
		private String daijiaDingdanPhone;
		/**
		* 出价
		*/
		@ColumnInfo(comment="出价",type="decimal(10,2)")
		private Double daijiaDingdanJine;
		/**
		* 备注
		*/

		@ColumnInfo(comment="备注",type="longtext")
		private String daijiaDingdanContent;
		/**
		* 订单状态
		*/
		@ColumnInfo(comment="订单状态",type="int(11)")
		private Integer daijiaDingdanTypes;
			/**
			* 订单状态的值
			*/
			@ColumnInfo(comment="订单状态的字典表值",type="varchar(200)")
			private String daijiaDingdanValue;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;



	public DaijiaDingdanCommentbackView() {

	}

	public DaijiaDingdanCommentbackView(DaijiaDingdanCommentbackEntity daijiaDingdanCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, daijiaDingdanCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 代驾订单
		/**
		* 获取：代驾订单 的 用户
		*/
		public Integer getDaijiaDingdanYonghuId() {
			return daijiaDingdanYonghuId;
		}
		/**
		* 设置：代驾订单 的 用户
		*/
		public void setDaijiaDingdanYonghuId(Integer daijiaDingdanYonghuId) {
			this.daijiaDingdanYonghuId = daijiaDingdanYonghuId;
		}
		/**
		* 获取：代驾订单 的 司机
		*/
		public Integer getDaijiaDingdanSijiId() {
			return daijiaDingdanSijiId;
		}
		/**
		* 设置：代驾订单 的 司机
		*/
		public void setDaijiaDingdanSijiId(Integer daijiaDingdanSijiId) {
			this.daijiaDingdanSijiId = daijiaDingdanSijiId;
		}

		/**
		* 获取： 订单编号
		*/
		public String getDaijiaDingdanUuidNumber() {
			return daijiaDingdanUuidNumber;
		}
		/**
		* 设置： 订单编号
		*/
		public void setDaijiaDingdanUuidNumber(String daijiaDingdanUuidNumber) {
			this.daijiaDingdanUuidNumber = daijiaDingdanUuidNumber;
		}

		/**
		* 获取： 出发位置
		*/
		public String getDaijiaDingdanChufaAddress() {
			return daijiaDingdanChufaAddress;
		}
		/**
		* 设置： 出发位置
		*/
		public void setDaijiaDingdanChufaAddress(String daijiaDingdanChufaAddress) {
			this.daijiaDingdanChufaAddress = daijiaDingdanChufaAddress;
		}

		/**
		* 获取： 前往位置
		*/
		public String getDaijiaDingdanQianwangAddress() {
			return daijiaDingdanQianwangAddress;
		}
		/**
		* 设置： 前往位置
		*/
		public void setDaijiaDingdanQianwangAddress(String daijiaDingdanQianwangAddress) {
			this.daijiaDingdanQianwangAddress = daijiaDingdanQianwangAddress;
		}

		/**
		* 获取： 车辆颜色
		*/
		public String getDaijiaDingdanYanse() {
			return daijiaDingdanYanse;
		}
		/**
		* 设置： 车辆颜色
		*/
		public void setDaijiaDingdanYanse(String daijiaDingdanYanse) {
			this.daijiaDingdanYanse = daijiaDingdanYanse;
		}

		/**
		* 获取： 车子品牌
		*/
		public String getDaijiaDingdanPinpai() {
			return daijiaDingdanPinpai;
		}
		/**
		* 设置： 车子品牌
		*/
		public void setDaijiaDingdanPinpai(String daijiaDingdanPinpai) {
			this.daijiaDingdanPinpai = daijiaDingdanPinpai;
		}

		/**
		* 获取： 车辆照片
		*/
		public String getDaijiaDingdanPhoto() {
			return daijiaDingdanPhoto;
		}
		/**
		* 设置： 车辆照片
		*/
		public void setDaijiaDingdanPhoto(String daijiaDingdanPhoto) {
			this.daijiaDingdanPhoto = daijiaDingdanPhoto;
		}

		/**
		* 获取： 车牌号
		*/
		public String getDaijiaDingdanChepaihao() {
			return daijiaDingdanChepaihao;
		}
		/**
		* 设置： 车牌号
		*/
		public void setDaijiaDingdanChepaihao(String daijiaDingdanChepaihao) {
			this.daijiaDingdanChepaihao = daijiaDingdanChepaihao;
		}

		/**
		* 获取： 联系人姓名
		*/
		public String getDaijiaDingdanLianxiren() {
			return daijiaDingdanLianxiren;
		}
		/**
		* 设置： 联系人姓名
		*/
		public void setDaijiaDingdanLianxiren(String daijiaDingdanLianxiren) {
			this.daijiaDingdanLianxiren = daijiaDingdanLianxiren;
		}

		/**
		* 获取： 联系电话
		*/
		public String getDaijiaDingdanPhone() {
			return daijiaDingdanPhone;
		}
		/**
		* 设置： 联系电话
		*/
		public void setDaijiaDingdanPhone(String daijiaDingdanPhone) {
			this.daijiaDingdanPhone = daijiaDingdanPhone;
		}

		/**
		* 获取： 出价
		*/
		public Double getDaijiaDingdanJine() {
			return daijiaDingdanJine;
		}
		/**
		* 设置： 出价
		*/
		public void setDaijiaDingdanJine(Double daijiaDingdanJine) {
			this.daijiaDingdanJine = daijiaDingdanJine;
		}

		/**
		* 获取： 备注
		*/
		public String getDaijiaDingdanContent() {
			return daijiaDingdanContent;
		}
		/**
		* 设置： 备注
		*/
		public void setDaijiaDingdanContent(String daijiaDingdanContent) {
			this.daijiaDingdanContent = daijiaDingdanContent;
		}
		/**
		* 获取： 订单状态
		*/
		public Integer getDaijiaDingdanTypes() {
			return daijiaDingdanTypes;
		}
		/**
		* 设置： 订单状态
		*/
		public void setDaijiaDingdanTypes(Integer daijiaDingdanTypes) {
			this.daijiaDingdanTypes = daijiaDingdanTypes;
		}


			/**
			* 获取： 订单状态的值
			*/
			public String getDaijiaDingdanValue() {
				return daijiaDingdanValue;
			}
			/**
			* 设置： 订单状态的值
			*/
			public void setDaijiaDingdanValue(String daijiaDingdanValue) {
				this.daijiaDingdanValue = daijiaDingdanValue;
			}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}


	@Override
	public String toString() {
		return "DaijiaDingdanCommentbackView{" +
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
			", daijiaDingdanContent=" + daijiaDingdanContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
