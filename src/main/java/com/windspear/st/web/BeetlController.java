package com.windspear.st.web;

import com.windspear.st.domain.User;
import com.windspear.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeetlController {

	@Autowired
    UserService service;
	
    @RequestMapping("/index.html")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("/index.btl");
        view.addObject("total", service.total());
        return view;
    }
    
    @RequestMapping("/addUser.html")
    public ModelAndView addUser() {
    	User user = new User();
    	user.setName("lijz");
    	service.save(user);
    	
        ModelAndView view = new ModelAndView("/index.btl");
        view.addObject("total", service.total());
        return view;
    }
}
