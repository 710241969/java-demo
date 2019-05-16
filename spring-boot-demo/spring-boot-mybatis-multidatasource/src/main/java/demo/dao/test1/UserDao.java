package demo.dao.test1;

import demo.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
}
