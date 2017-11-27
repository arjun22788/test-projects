package org.aemple.expense.web.custom;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Authentication authentication) throws IOException, ServletException {
		// do some logic here if you want something to be done whenever
		// the user successfully logs in.
		String responseUrl = null;
		HttpSession session = httpServletRequest.getSession();
		User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("username", authUser.getUsername());
		session.setAttribute("authorities", authentication.getAuthorities());
		System.out.println(authentication.getAuthorities().toString());
		// set our response to OK status
		httpServletResponse.setStatus(HttpServletResponse.SC_OK);
		if (authentication.getAuthorities().toString().contains("ADMIN")) {
			System.out.println("hello admin authenticated");
			responseUrl = "admin";
		} else {
			responseUrl = "defaultUrl";
		}
		// since we have created our custom success handler, its up to us to
		// where
		// we will redirect the user after successfully login
		httpServletResponse.sendRedirect(responseUrl);
	}
}