package com.ezen.aclearn.service.lctr;

import java.util.List;

import com.ezen.aclearn.vo.LctrVO;

public interface LctrService {
	// 강의 목록 조회
	List<LctrVO> getLctrList();
	
	// 강의 세부 조회
	LctrVO getLctr(int lctrCode);

}
