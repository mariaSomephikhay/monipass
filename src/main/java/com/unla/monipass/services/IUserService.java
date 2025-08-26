package com.unla.monipass.services;

import com.unla.monipass.entities.User;

public interface IUserService {
	public User getUserById(String id) throws Exception;
	public User createUser(User user)throws Exception;
	public User loginUser(User user)throws Exception;
}
