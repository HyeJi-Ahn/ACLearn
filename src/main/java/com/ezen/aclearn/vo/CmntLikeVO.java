package com.ezen.aclearn.vo;

public class CmntLikeVO {
	public int cmntCode;
	public String userId;

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

	@Override
	public String toString() {
		return "CmntLikeVO [cmntCode=" + cmntCode + ", userId=" + userId + "]";
	}

}
