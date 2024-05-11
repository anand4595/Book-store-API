package com.example.Book.Store.API.config;

import com.example.Book.Store.API.argumentResolver.UserArgumentResolver;
import com.example.Book.Store.API.interceptor.RequestAndResponseLogInterceptor;
import com.example.Book.Store.API.interceptor.UserAuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private RequestAndResponseLogInterceptor requestAndResponseLogInterceptor;

	@Autowired
	private UserAuthInterceptor userAuthInterceptor;


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestAndResponseLogInterceptor);
		registry.addInterceptor(userAuthInterceptor);
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(new UserArgumentResolver());
	}
}