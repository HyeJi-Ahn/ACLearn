package com.ezen.aclearn.service.like.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.like.LikeService;

@Service
public class LikeServiceImpl implements LikeService {
	@Autowired
	private LikeDAO likeDAO;
}
