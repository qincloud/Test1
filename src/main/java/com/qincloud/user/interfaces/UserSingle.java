package com.qincloud.user.interfaces;

import java.util.List;

import com.qincloud.pojo.User;

public interface UserSingle {
	public void insert(User user);

	public List<User> getUsers();

	public User FindUser(String username) throws Exception;

}
