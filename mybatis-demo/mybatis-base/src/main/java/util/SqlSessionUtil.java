package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static final String MYBATIS_CONFIG = "mybatis-config.xml";
    private static SqlSession sqlSession;

    {
        InputStream inputStream = null;
        try {
            // 读取配置文件 mybatis 的配置文件
            // 使用 MyBatis 提供的 Resources 类加载 mybatis 的配置文件
            inputStream = Resources.getResourceAsStream(MYBATIS_CONFIG);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // SqlSessionFactoryBuilder 构建 sqlSession 的工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建能执行映射文件中 sql 的 sqlSession
        sqlSession = sqlSessionFactory.openSession();
    }

    private SqlSessionUtil() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static SqlSession getSqlSession() {
        return sqlSession;
    }
}
