package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DaijiaDingdanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 代驾订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("daijia_dingdan")
public class DaijiaDingdanView extends DaijiaDingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单状态的值
	*/
	@ColumnInfo(comment="订单状态的字典表值",type="varchar(200)")
	private String daijiaDingdanValue;

	//级联表 司机
		/**
		* 司机编号
		*/

		@ColumnInfo(comment="司机编号",type="varchar(200)")
		private String sijiUuidNumber;
		/**
		* 司机姓名
		*/

		@ColumnInfo(comment="司机姓名",type="varchar(200)")
		private String sijiName;
		/**
		* 司机手机号
		*/

		@ColumnInfo(comment="司机手机号",type="varchar(200)")
		private String sijiPhone;
		/**
		* 司机身份证号
		*/

		@ColumnInfo(comment="司机身份证号",type="varchar(200)")
		private String sijiIdNumber;
		/**
		* 司机头像
		*/

		@ColumnInfo(comment="司机头像",type="varchar(200)")
		private String sijiPhoto;
		/**
		* 司机邮箱
		*/

		@ColumnInfo(comment="司机邮箱",type="varchar(200)")
		private String sijiEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
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
	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public DaijiaDingdanView() {

	}

	public DaijiaDingdanView(DaijiaDingdanEntity daijiaDingdanEntity) {
		try {
			BeanUtils.copyProperties(this, daijiaDingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
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


	//级联表的get和set 司机

		/**
		* 获取： 司机编号
		*/
		public String getSijiUuidNumber() {
			return sijiUuidNumber;
		}
		/**
		* 设置： 司机编号
		*/
		public void setSijiUuidNumber(String sijiUuidNumber) {
			this.sijiUuidNumber = sijiUuidNumber;
		}

		/**
		* 获取： 司机姓名
		*/
		public String getSijiName() {
			return sijiName;
		}
		/**
		* 设置： 司机姓名
		*/
		public void setSijiName(String sijiName) {
			this.sijiName = sijiName;
		}

		/**
		* 获取： 司机手机号
		*/
		public String getSijiPhone() {
			return sijiPhone;
		}
		/**
		* 设置： 司机手机号
		*/
		public void setSijiPhone(String sijiPhone) {
			this.sijiPhone = sijiPhone;
		}

		/**
		* 获取： 司机身份证号
		*/
		public String getSijiIdNumber() {
			return sijiIdNumber;
		}
		/**
		* 设置： 司机身份证号
		*/
		public void setSijiIdNumber(String sijiIdNumber) {
			this.sijiIdNumber = sijiIdNumber;
		}

		/**
		* 获取： 司机头像
		*/
		public String getSijiPhoto() {
			return sijiPhoto;
		}
		/**
		* 设置： 司机头像
		*/
		public void setSijiPhoto(String sijiPhoto) {
			this.sijiPhoto = sijiPhoto;
		}

		/**
		* 获取： 司机邮箱
		*/
		public String getSijiEmail() {
			return sijiEmail;
		}
		/**
		* 设置： 司机邮箱
		*/
		public void setSijiEmail(String sijiEmail) {
			this.sijiEmail = sijiEmail;
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

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "DaijiaDingdanView{" +
			", daijiaDingdanValue=" + daijiaDingdanValue +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", sijiUuidNumber=" + sijiUuidNumber +
			", sijiName=" + sijiName +
			", sijiPhone=" + sijiPhone +
			", sijiIdNumber=" + sijiIdNumber +
			", sijiPhoto=" + sijiPhoto +
			", sijiEmail=" + sijiEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
