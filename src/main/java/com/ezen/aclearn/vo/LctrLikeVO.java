package com.ezen.aclearn.vo;

public class LctrLikeVO {
	private int lctrCode;
	private String userId;

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

	@Override
	public String toString() {
		return "LctrLikeVO [lctrCode=" + lctrCode + ", userId=" + userId + "]";
	}

}
