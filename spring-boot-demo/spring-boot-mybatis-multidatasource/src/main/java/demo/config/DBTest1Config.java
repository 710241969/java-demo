package demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// 配置不在 resources 目录下，则用 @PropertySource 指定配置位置
// 在这里 DBTest1Config 使用直接在 resources 目录下的配置通过 spring.profiles.include 进行演示
// DBTest2Config 使用另外一种进行演示
//@PropertySource(value = {"classpath:application-db-test1.yml"})
@ConfigurationProperties(prefix = "spring.datasource.test1")
@Component
public class DBTest1Config {
    private String url;
    private String username;
    private String password;
    private String driver;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
