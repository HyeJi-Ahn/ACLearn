package com.ezen.aclearn.vo;

import java.sql.Date;

public class CmntVO {
	private int cmntCode;
	private String userId;
	private String userNickname;
	private String cmntTitle;
	private String cmntContents;
	private String cmntOriImg;
	private String cmntNowImg;
	private Date cmntRegdate;
	private Date cmntModfdate;
	private char cmntDelYn;

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

	public String getCmntTitle() {
		return cmntTitle;
	}

	public void setCmntTitle(String cmntTitle) {
		this.cmntTitle = cmntTitle;
	}

	public String getCmntContents() {
		return cmntContents;
	}

	public void setCmntContents(String cmntContents) {
		this.cmntContents = cmntContents;
	}

	public String getCmntOriImg() {
		return cmntOriImg;
	}

	public void setCmntOriImg(String cmntOriImg) {
		this.cmntOriImg = cmntOriImg;
	}

	public String getCmntNowImg() {
		return cmntNowImg;
	}

	public void setCmntNowImg(String cmntNowImg) {
		this.cmntNowImg = cmntNowImg;
	}

	public Date getCmntRegdate() {
		return cmntRegdate;
	}

	public void setCmntRegdate(Date cmntRegdate) {
		this.cmntRegdate = cmntRegdate;
	}

	public Date getCmntModfdate() {
		return cmntModfdate;
	}

	public void setCmntModfdate(Date cmntModfdate) {
		this.cmntModfdate = cmntModfdate;
	}

	public char getCmntDelYn() {
		return cmntDelYn;
	}

	public void setCmntDelYn(char cmntDelYn) {
		this.cmntDelYn = cmntDelYn;
	}

	@Override
	public String toString() {
		return "CmntVO [cmntCode=" + cmntCode + ", userId=" + userId + ", userNickname=" + userNickname + ", cmntTitle="
				+ cmntTitle + ", cmntContents=" + cmntContents + ", cmntOriImg=" + cmntOriImg + ", cmntNowImg="
				+ cmntNowImg + ", cmntRegdate=" + cmntRegdate + ", cmntModfdate=" + cmntModfdate + ", cmntDelYn="
				+ cmntDelYn + "]";
	}

	

}
