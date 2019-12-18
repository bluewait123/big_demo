package com.spring.boot.demo.common.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 线程名过滤
 * @author test
 * @date 2019/12/13
 */
@Slf4j
public class ThreadNameFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
		String name = Thread.currentThread().getName();
		Thread.currentThread().setName(getOnlyPK());
		long startTime = System.currentTimeMillis();
		log.info("thread start");
		filterChain.doFilter(httpServletRequest, httpServletResponse);
		long endTime = System.currentTimeMillis();
		log.info("thread end --> cost:[{}]", (endTime - startTime));
		Thread.currentThread().setName(name);
	}

	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

	public static String getOnlyPK() {
		int min = 1000000;
		int max = 9999999;
		int tmp = new Random().nextInt(Integer.MAX_VALUE);
		StringBuilder sb = new StringBuilder();
		sb.append(simpleDateFormat.format(new Date()));
		sb.append(tmp % (max - min + 1) + min);
		return sb.toString();
	}

}
