package com.spring.service;

import com.spring.dao.UserDAOYS;

public class UserServiceYeonsoo implements UserServiceYS {
	@Override
	public int getCount2() {
		return UserDAOYS.getCount2();
	}
}
