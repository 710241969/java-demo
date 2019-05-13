import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import pojo.User;
import util.SqlSessionUtil;

import java.io.IOException;
import java.util.List;

/**
 * 操作测试类
 */
public class TestUser {
    private List<User> userList;

    /**
     * mybatis-config.xml 的映射器 mappers 配置中使用短名称命名空间
     * 通过短名称命名空间操作
     *
     * @throws IOException
     */
    @Test
    public void Test() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        try {
            List<User> userList = sqlSession.selectList("UserMapper.selectAllUser");
            System.out.println(userList);
        } finally {
            sqlSession.close();
        }
    }

    /**
     * mybatis-config.xml 的映射器 mappers 配置中使用完全限定名
     * 通过完全限定名的接口操作
     * TIPS: 推荐使用这种方式
     *
     * @throws IOException
     */
    @Test
    public void Test2() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.selectAllUser();
            System.out.println(userList);
        } finally {
            sqlSession.close();
        }
    }
}
