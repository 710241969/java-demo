import dao.UserDao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUser {
    private List<User> userList;

    @Test
    public void Test() throws IOException {
        // 读取配置文件
        // mybatis的配置文件
        String resource = "mybatis-config.xml";
        // 使用MyBatis提供的Resources类加载mybatis的配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 构建sqlSession的工厂
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 创建能执行映射文件中sql的sqlSession
        SqlSession session = sqlSessionFactory.openSession();

        List<User> userList = session.selectList("UserMapper.selectAllUser");
        System.out.println(userList);

    }

    @Test
    public void Test2() throws IOException {
        // 读取配置文件
        // mybatis的配置文件
        String resource = "mybatis-config.xml";
        // 使用MyBatis提供的Resources类加载mybatis的配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 构建sqlSession的工厂
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 创建能执行映射文件中sql的sqlSession
        SqlSession session = sqlSessionFactory.openSession();

        UserDao userDao=session.getMapper(UserDao.class);
        List<User> userList = userDao.selectAllUser();
        System.out.println(userList);

    }
}
