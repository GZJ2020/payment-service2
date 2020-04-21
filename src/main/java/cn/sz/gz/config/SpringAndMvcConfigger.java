package cn.sz.gz.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringAndMvcConfigger {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
	@Bean
	public MapperScannerConfigurer configurer() {
		MapperScannerConfigurer conf = new MapperScannerConfigurer();
		conf.setSqlSessionFactoryBeanName("sqlSessionFactory");
		conf.setBasePackage("cn.sz.gz.dao");
		return conf;
	}
	
}
