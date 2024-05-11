package com.example.Book.Store.API.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author anand
 * Interceptor class to log requests.
 */
@Service
@Slf4j
public class RequestAndResponseLogInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String ipAddress = request.getHeader("X-FORWARDED-FOR");
		if (ipAddress == null) {
			ipAddress = request.getRemoteAddr();
		}
		log.info("RequestAndResponseLogInterceptor::preHandle - Request made from - " + ipAddress);
		String requestEndPoint = request.getRequestURI();
		log.info("RequestAndResponseLogInterceptor::preHandle - Request url - " + requestEndPoint);
		// [Task] @Anand make a DB call afterward.
		return true;
	}
}