package demo.service;

import demo.dao.test1.UserDao;
import demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> listUser() {
        return userDao.selectAllUser();
    }
}
