package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BoardDAO;

@Service
public class BoardServiceYeonsoo implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public int getCount() {
		return boardDAO.getCount();
	}
	@Override
	public int getYeonsooCount() {
		return boardDAO.getYeonsooCount();
	}

}
