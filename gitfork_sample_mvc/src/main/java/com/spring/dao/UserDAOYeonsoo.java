package com.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDAOYeonsoo implements UserDAOYS {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getCount2() {
		return sqlSession.selectOne("generalSQL.sooCount");
		
	}
}
