package demo.config;

import org.apache.ibatis.session.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class MyBatisConfig {
    @Value("${mybatis.configuration.map-underscore-to-camel-case}")
    private Boolean mapUnderscoreToCamelCase;

    public org.apache.ibatis.session.Configuration getConfig() {
        Configuration configuration = new Configuration();
        configuration.setMapUnderscoreToCamelCase(mapUnderscoreToCamelCase);
        return configuration;
    }
}
