package com.dodo.project.base.admin.dao.system.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSystemUser<M extends BaseSystemUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}
	
	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setQq(java.lang.String qq) {
		set("qq", qq);
	}
	
	public java.lang.String getQq() {
		return getStr("qq");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public void setLoginNum(java.math.BigInteger loginNum) {
		set("login_num", loginNum);
	}
	
	public java.math.BigInteger getLoginNum() {
		return get("login_num");
	}

	public void setLoginAt(java.util.Date loginAt) {
		set("login_at", loginAt);
	}
	
	public java.util.Date getLoginAt() {
		return get("login_at");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setSystemUserGroupId(java.lang.String systemUserGroupId) {
		set("system_user_group_id", systemUserGroupId);
	}
	
	public java.lang.String getSystemUserGroupId() {
		return getStr("system_user_group_id");
	}

	public void setIsDeleted(java.lang.Boolean isDeleted) {
		set("is_deleted", isDeleted);
	}
	
	public java.lang.Boolean getIsDeleted() {
		return get("is_deleted");
	}

	public void setCreateBy(java.math.BigInteger createBy) {
		set("create_by", createBy);
	}
	
	public java.math.BigInteger getCreateBy() {
		return get("create_by");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
