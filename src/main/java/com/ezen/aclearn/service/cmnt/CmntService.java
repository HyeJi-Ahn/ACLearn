package com.ezen.aclearn.service.cmnt;

import java.util.List;
import java.util.Map;

import com.ezen.aclearn.vo.CmntVO;

public interface CmntService {
	
	// 커뮤니티 게시글 목록 조회
	List<CmntVO> getCmntList(Map<String, String> paramMap);
	
	// 커뮤니티 게시글 상세 조회
	CmntVO getCmnt(int cmntCode);

	// 커뮤니티 게시글 조회수 증가
	void updateCmntCnt(int cmntCode);

	// 커뮤니티 게시글 수정
	void updateCmnt(CmntVO cmntVO);

	// 커뮤니티 게시글 등록
	int insertCmnt(CmntVO cmntVO);

	// 커뮤니티 게시글 삭제
	void deleteCmnt(int cmntCode);

	
	
}
