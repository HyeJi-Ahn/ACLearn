package com.ezen.aclearn.service.cmnt;

import java.util.List;

import com.ezen.aclearn.vo.CmntVO;

public interface CmntService {
	
	// 커뮤니티 게시글 목록 조회
	List<CmntVO> getCmntList();

	CmntVO getCmnt(int cmntNo);
	
	
	
}
