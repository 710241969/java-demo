package demo.service;

import demo.dao.test2.User2Dao;
import demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User2Service {
    @Autowired
    private User2Dao user2Dao;

    public List<User> listUser() {
        return user2Dao.selectAllUser();
    }
}
