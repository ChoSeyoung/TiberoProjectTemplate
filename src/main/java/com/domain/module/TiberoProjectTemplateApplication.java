package com.domain.module;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value = { "com.domain.module.mapper" })
public class TiberoProjectTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiberoProjectTemplateApplication.class, args);
	}

	// SqlSessionFactory 설정
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

		sessionFactory.setDataSource(dataSource);

		Resource configLocation = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml");

		sessionFactory.setConfigLocation(configLocation);

		return sessionFactory.getObject();
	}

}
