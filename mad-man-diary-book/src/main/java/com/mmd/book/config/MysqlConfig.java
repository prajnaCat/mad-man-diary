package com.mmd.book.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@EnableJpaRepositories("com.mmd.book.repository")
@EnableTransactionManagement
@EntityScan("com.mmd.book.domain")
public class MysqlConfig {

    @Bean(name = "dataSource", initMethod = "init", destroyMethod = "close")
    @Profile("!build-test")
    public DruidDataSource dataSource(Environment environment) throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(environment.getProperty("mysql.connection.url"));
        dataSource.setUsername(environment.getProperty("mysql.connection.username"));
        dataSource.setPassword(environment.getProperty("mysql.connection.password"));
        dataSource.setInitialSize(environment.acceptsProfiles(Profiles.of("lc", "de")) ? 1 : 10);
        dataSource.setMinIdle(1);
        dataSource.setMaxActive(200);
        dataSource.setMaxWait(60000L);
        dataSource.setTimeBetweenEvictionRunsMillis(60000L);
        dataSource.setMinEvictableIdleTimeMillis(300000L);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(50);
        dataSource.setFilters("wall");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}