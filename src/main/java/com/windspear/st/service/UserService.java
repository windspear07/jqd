package com.windspear.st.service;


import com.windspear.st.domain.User;

public interface UserService {
	public long total() ;
	public void save(User user);
	public void allUser(User query);
}
