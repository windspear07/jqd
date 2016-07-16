package com.windspear.st.service.impl;

import com.windspear.st.dao.UserDao;
import com.windspear.st.domain.User;
import com.windspear.st.service.UserService;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao; // mapper
    @Autowired
    SQLManager sql;
	@Transactional
	public long total() {
		return dao.allCount();
	}
	@Transactional
	public void save(User user) {
		dao.insert(user,true);
	}
	public void allUser(User query) {
		dao.selectUser(query);
		
	}
}
