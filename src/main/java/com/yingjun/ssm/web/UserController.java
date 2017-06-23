package com.yingjun.ssm.web;

import com.yingjun.ssm.dao.MngusertbDao;
import com.yingjun.ssm.dao.UserDao;
import com.yingjun.ssm.entity.Mngusertb;
import com.yingjun.ssm.entity.User;
import com.yingjun.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MngusertbDao mngusertbDao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, Integer offset, Integer limit) {
		LOG.info("invoke----------/user/list");
		offset = offset == null ? 0 : offset;//默认便宜0
		limit = limit == null ? 50 : limit;//默认展示50条
		List<User> list = userService.getUserList(offset, limit);
		model.addAttribute("userlist", list);
		return "userlist";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		LOG.info("invoke----------/user/index");
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest request, HttpServletResponse response, String userName, String password)
			throws ServletException, IOException {
		LOG.info("invoke----------/user/login");
		int userNo = mngusertbDao.queryByUserName(userName, password);
		if (userNo > 0) {
			Mngusertb user = new Mngusertb();
			user.setUsername(userName);
			user.setPassword(password);
			request.getSession().setAttribute("loginedUser",user);
			return "index";
		} else {
			return "redirect:/login.jsp";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(Model model, HttpServletRequest request) {
		LOG.info("invoke----------/user/logout");
		request.getSession().removeAttribute("loginedUser");
		return "redirect:/login.jsp";
	}
	
	@RequestMapping(value = "/tables", method = RequestMethod.POST)
	public String tables(Model model) {
		LOG.info("invoke----------/user/tables");
		return "tables";
	}
	
	@RequestMapping(value = "/testProgress", method = RequestMethod.POST)
	public String testProgress(Model model) {
		LOG.info("invoke----------/user/testProgress");
		return "testProgress";
	}
}
