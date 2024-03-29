package br.com.devdojo.springboot.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataConfiguration {
	  @Value("${spring.datasource.url}")
	  private String dbUrl;

	  @Bean
	  public DataSource dataSource() {
	      HikariConfig config = new HikariConfig();
	      config.setJdbcUrl(dbUrl);
	      config.setDriverClassName("org.postgresql.Driver");
	      return new HikariDataSource(config);
	  }
	
}
