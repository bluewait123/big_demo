package com.spring.boot.demo.common.config;

import com.spring.boot.demo.common.filter.ThreadNameFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册过滤器
 * @author test
 * @date 2019/12/13
 */
@Configuration
public class FilterConfiguration {
	@Bean
	public FilterRegistrationBean threadNameFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new ThreadNameFilter());
		registration.addUrlPatterns("/*");
		registration.setName("threadNameFilter");
		registration.setOrder(10);
		return registration;
	}
}
