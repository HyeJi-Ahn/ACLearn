package com.ezen.aclearn.vo;

public class LctrVO {
	private int lctrCode;
	private String lctrTitle;
	private String lctrDetails;
	private String lctrVideoLink;
	private int lctrCnt;
	private int lctrLike;
	private String lctrOriImg1;
	private String lctrNowImg1;
	private String lctrOriImg2;
	private String lctrNowImg2;
	private char lctrUseYn;

	public int getLctrCode() {
		return lctrCode;
	}

	public void setLctrCode(int lctrCode) {
		this.lctrCode = lctrCode;
	}

	public String getLctrTitle() {
		return lctrTitle;
	}

	public void setLctrTitle(String lctrTitle) {
		this.lctrTitle = lctrTitle;
	}

	public String getLctrDetails() {
		return lctrDetails;
	}

	public void setLctrDetails(String lctrDetails) {
		this.lctrDetails = lctrDetails;
	}

	public String getLctrVideoLink() {
		return lctrVideoLink;
	}

	public void setLctrVideoLink(String lctrVideoLink) {
		this.lctrVideoLink = lctrVideoLink;
	}

	public int getLctrCnt() {
		return lctrCnt;
	}

	public void setLctrCnt(int lctrCnt) {
		this.lctrCnt = lctrCnt;
	}

	public int getLctrLike() {
		return lctrLike;
	}

	public void setLctrLike(int lctrLike) {
		this.lctrLike = lctrLike;
	}

	public String getLctrOriImg1() {
		return lctrOriImg1;
	}

	public void setLctrOriImg1(String lctrOriImg1) {
		this.lctrOriImg1 = lctrOriImg1;
	}

	public String getLctrNowImg1() {
		return lctrNowImg1;
	}

	public void setLctrNowImg1(String lctrNowImg1) {
		this.lctrNowImg1 = lctrNowImg1;
	}

	public String getLctrOriImg2() {
		return lctrOriImg2;
	}

	public void setLctrOriImg2(String lctrOriImg2) {
		this.lctrOriImg2 = lctrOriImg2;
	}

	public String getLctrNowImg2() {
		return lctrNowImg2;
	}

	public void setLctrNowImg2(String lctrNowImg2) {
		this.lctrNowImg2 = lctrNowImg2;
	}

	public char getLctrUseYn() {
		return lctrUseYn;
	}

	public void setLctrUseYn(char lctrUseYn) {
		this.lctrUseYn = lctrUseYn;
	}

	@Override
	public String toString() {
		return "UserLctrVO [lctrCode=" + lctrCode + ", lctrTitle=" + lctrTitle + ", lctrDetails=" + lctrDetails
				+ ", lctrVideoLink=" + lctrVideoLink + ", lctrCnt=" + lctrCnt + ", lctrLike=" + lctrLike
				+ ", lctrOriImg1=" + lctrOriImg1 + ", lctrNowImg1=" + lctrNowImg1 + ", lctrOriImg2=" + lctrOriImg2
				+ ", lctrNowImg2=" + lctrNowImg2 + ", lctrUseYn=" + lctrUseYn + "]";
	}

}
