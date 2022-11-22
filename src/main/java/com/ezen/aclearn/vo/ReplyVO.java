package com.ezen.aclearn.vo;

import java.sql.Date;

public class ReplyVO {
	private int rpCode;
	private int cmntCode;
	private String userId;
	private String userNickname;
	private String rpContents;
	private Date rpRegdate;
	private Date rpModfdate;
	private char rpDelYn;

	public int getRpCode() {
		return rpCode;
	}

	public void setRpCode(int rpCode) {
		this.rpCode = rpCode;
	}

	public int getCmntCode() {
		return cmntCode;
	}

	public void setCmntCode(int cmntCode) {
		this.cmntCode = cmntCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getRpContents() {
		return rpContents;
	}

	public void setRpContents(String rpContents) {
		this.rpContents = rpContents;
	}

	public Date getRpRegdate() {
		return rpRegdate;
	}

	public void setRpRegdate(Date rpRegdate) {
		this.rpRegdate = rpRegdate;
	}

	public Date getRpModfdate() {
		return rpModfdate;
	}

	public void setRpModfdate(Date rpModfdate) {
		this.rpModfdate = rpModfdate;
	}

	public char getRpDelYn() {
		return rpDelYn;
	}

	public void setRpDelYn(char rpDelYn) {
		this.rpDelYn = rpDelYn;
	}

	@Override
	public String toString() {
		return "ReplyVO [rpCode=" + rpCode + ", cmntCode=" + cmntCode + ", userId=" + userId + ", userNickname="
				+ userNickname + ", rpContents=" + rpContents + ", rpRegdate=" + rpRegdate + ", rpModfdate="
				+ rpModfdate + ", rpDelYn=" + rpDelYn + "]";
	}

}
