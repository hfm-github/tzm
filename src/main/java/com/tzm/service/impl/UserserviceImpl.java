package com.tzm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tzm.bean.UserBean;
import com.tzm.dao.UserDao;
import com.tzm.service.UserService;

@Service
@SuppressWarnings("restriction")
public class UserserviceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	@Cacheable(value = "userCache", key = "#userId")
	public UserBean get(String userId) {
		// TODO Auto-generated method stub
		return userDao.get(userId);
	}

	@Override
	@Cacheable(value = "userCache", key = "all")
	public List<UserBean> gets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Cacheable(value = "userCache", key = "#userName")
	public List<UserBean> gets(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@CacheEvict(value = "userCache" , allEntries=true)
	public void add(UserBean user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	@CacheEvict(value = "userCache" , allEntries=true)
	public void delete(String innerId) {
		// TODO Auto-generated method stub
		UserBean user = new UserBean();
		user.setInnerId(innerId);
		userDao.delete(user);
	}

	@Override
	@CacheEvict(value = "userCache" , allEntries=true)
	public void update(UserBean user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

}
