package demo.dao;

import demo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
}
