package kr.co.myboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.myboard.beans.UserBean;
import kr.co.myboard.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public boolean checkUserIdExist(String user_id) {
		String user_name = userDao.checkUserIdExist(user_id);
		if(user_name == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	}
	
	public UserBean getLoginUserInfo(UserBean loginBean) {
		return userDao.getLoginUserInfo(loginBean);
	}
}