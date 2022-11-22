package com.ezen.aclearn.vo;

import java.sql.Date;

public class ReviewVO {
	private int reCode;
	private int lctrCode;
	private String userId;
	private String userNickname;
	private float reScore;
	private String reContents;
	private Date reRegdate;
	private Date modfDate;
	private char reDelYn;

	public int getReCode() {
		return reCode;
	}

	public void setReCode(int reCode) {
		this.reCode = reCode;
	}

	public int getLctrCode() {
		return lctrCode;
	}

	public void setLctrCode(int lctrCode) {
		this.lctrCode = lctrCode;
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

	public float getReScore() {
		return reScore;
	}

	public void setReScore(float reScore) {
		this.reScore = reScore;
	}

	public String getReContents() {
		return reContents;
	}

	public void setReContents(String reContents) {
		this.reContents = reContents;
	}

	public Date getReRegdate() {
		return reRegdate;
	}

	public void setReRegdate(Date reRegdate) {
		this.reRegdate = reRegdate;
	}

	public Date getModfDate() {
		return modfDate;
	}

	public void setModfDate(Date modfDate) {
		this.modfDate = modfDate;
	}

	public char getReDelYn() {
		return reDelYn;
	}

	public void setReDelYn(char reDelYn) {
		this.reDelYn = reDelYn;
	}

	@Override
	public String toString() {
		return "ReviewVO [reCode=" + reCode + ", lctrCode=" + lctrCode + ", userId=" + userId + ", userNickname="
				+ userNickname + ", reScore=" + reScore + ", reContents=" + reContents + ", reRegdate=" + reRegdate
				+ ", modfDate=" + modfDate + ", reDelYn=" + reDelYn + "]";
	}

}
