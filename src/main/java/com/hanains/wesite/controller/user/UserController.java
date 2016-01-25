package com.hanains.wesite.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanains.wesite.domain.user.User;
import com.hanains.wesite.service.user.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println(this.getClass());
	}
	
	@RequestMapping("/joinform")
	public String joinform(){
		return "/user/joinform";
	}
	
	@RequestMapping("/loginform")
	public String loginform(){
		return "/user/loginform";
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute User user) throws Exception{
		userService.join(user);
		return "redirect:/user/joinsuccess";
	}
	
	@RequestMapping("/joinsuccess")
	public String joinsuccess(){
		return "/user/joinsuccess";
	}
	
	@RequestMapping("/login")
	public String login(HttpSession session, @ModelAttribute User user) throws Exception{
		
		User authUser=userService.login(user);
		System.out.println("::login="+authUser);
		
		if(user.getEmail().equals(authUser.getEmail())){
			session.setAttribute("authUser", authUser);			
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("authUser");
		session.invalidate();
		
		return "redirect:/";
	}
}
