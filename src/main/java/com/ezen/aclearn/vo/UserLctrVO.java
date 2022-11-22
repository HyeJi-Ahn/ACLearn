package com.ezen.aclearn.vo;

public class UserLctrVO {
	private String userId;
	private int lctrCode;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getLctrCode() {
		return lctrCode;
	}

	public void setLctrCode(int lctrCode) {
		this.lctrCode = lctrCode;
	}

	@Override
	public String toString() {
		return "UserLctrVO [userId=" + userId + ", lctrCode=" + lctrCode + "]";
	}

}
