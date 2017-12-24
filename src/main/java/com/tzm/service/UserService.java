package com.tzm.service;

import java.util.List;

import com.tzm.bean.UserBean;

public interface UserService {

	/**
	 * 根据userId获取用户
	 * @param userId
	 * @return
	 */
	public UserBean get(String userId);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<UserBean> gets();
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<UserBean> gets(String userName);
	
	/**
	 * 添加用戶
	 * @param user
	 */
	public void add(UserBean user);
	/**
	 * 刪除用戶
	 * @param innerId
	 */
	public void delete(String innerId);
	
	/**
	 * 修改用戶 
	 * @param user
	 */
	public void update(UserBean user);
}
