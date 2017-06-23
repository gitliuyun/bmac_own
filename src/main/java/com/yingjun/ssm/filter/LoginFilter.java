package com.yingjun.ssm.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class LoginFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		// 不过滤的uri
		String[] notFilter = new String[] { "bmac_own/user/login" };

		// 请求的uri
		String uri = request.getRequestURI();
		// uri中包含background时才进行过滤
		// 是否过滤
		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.indexOf(s) != -1) {
				// 如果uri中包含不过滤的uri，则不进行过滤
				doFilter = false;
				break;
			}
		}
		//放行css和js请求
		if (uri != null) {
			String extention = uri.substring(uri.lastIndexOf(".") + 1);
			if ("css".equals(extention) || "js".equals(extention) || "map".equals(extention)) {
				// 如果uri中包含不过滤的uri，则不进行过滤
				doFilter = false;
			}
		}
		
		if (doFilter) {
			// 执行过滤
			// 从session中获取登录者实体
			Object obj = request.getSession().getAttribute("loginedUser");
			if (null == obj) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				String servletPath = request.getServletPath();
				if ("/".equals(servletPath)) {
					String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";  
					response.sendRedirect(basePath + "/user/index");
					return;
				}
				// 如果session中存在登录者实体，则继续
				filterChain.doFilter(request, response);
			}
		} else {
			// 如果不执行过滤，则继续
			filterChain.doFilter(request, response);
		}
	}
}
