package com.ezen.aclearn.vo;

import java.sql.Date;

public class UserVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userNickname;
	private String userBirth;
	private Date userRegdate;
	private Date userModfdate;
	private char userUseYn;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public Date getUserRegdate() {
		return userRegdate;
	}

	public void setUserRegdate(Date userRegdate) {
		this.userRegdate = userRegdate;
	}

	public Date getUserModfdate() {
		return userModfdate;
	}

	public void setUserModfdate(Date userModfdate) {
		this.userModfdate = userModfdate;
	}

	public char getUserUseYn() {
		return userUseYn;
	}

	public void setUserUseYn(char userUseYn) {
		this.userUseYn = userUseYn;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userNickname="
				+ userNickname + ", userBirth=" + userBirth + ", userRegdate=" + userRegdate + ", userModfdate="
				+ userModfdate + ", userUseYn=" + userUseYn + "]";
	}

	
}
