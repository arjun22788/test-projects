package org.aemple.expense.web.controller;

import org.aemple.expense.model.UserInfo;
import org.aemple.expense.model.UserRoles;
import org.aemple.expense.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	UserDetailsService detailsService;
	
	@RequestMapping(value="/createUser", method = RequestMethod.GET)
	public ModelAndView	createUser() {
		
		ModelAndView model = new ModelAndView();
		UserInfo details = new UserInfo();
		details.setFirstName("Robo");
		details.setUsername("robot");
		details.setPassword("123456");
		details.setEnabled(true);
		details.setEmail("robo@gmail.com");
		UserRoles roles = new UserRoles();
		roles.setId(2);
		details.setRoles(roles);
		
		detailsService.createUserDetails(details);
		model.setViewName("admin");
		return model;
	}
}
