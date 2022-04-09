package com.mrli.entity;

import java.util.Date;

public class User {
	private Integer id;//ID
	private String userName;//用户名称
	private String userPassword;//密码
	private Integer gender;//性别
	private Date birthday;//出生日期
	private String phone;//手机号
	private String address;//地址
	private Integer userRole;//用户角色（取自角色表-角色id）
	private Date creationDate;//创建时间
	private Date modifyDate;//修改时间
	private String briefIntroduction;//个性签名

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", gender=" + gender +
				", birthday=" + birthday +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				", userRole=" + userRole +
				", creationDate=" + creationDate +
				", modifyDate=" + modifyDate +
				", briefIntroduction='" + briefIntroduction + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getBriefIntroduction() {
		return briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}
}
