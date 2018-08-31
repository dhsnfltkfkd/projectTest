package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Controller
//@Component
public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/user/writeForm.do", method=RequestMethod.GET)
	public String writeForm() {
		return "/user/writeForm";
	}
	
	@RequestMapping(value="/user/write.do", method=RequestMethod.POST)
	public String write(@ModelAttribute UserDTO userDTO) {
		//DB
		userDAO.write(userDTO);
		return "/user/write";
	}
	
	@RequestMapping(value="/user/checkId.do", method=RequestMethod.POST)
	public @ResponseBody String checkId(@RequestParam String id) {
		if(id.equals("")) return "empty";
		
		//DB
		UserDTO userDTO = userDAO.existId(id);
		
		if(userDTO==null) return "not_exist";
		else return "exist";
	}
	
	@RequestMapping(value="/user/list.do", method=RequestMethod.GET)
	public String list() {
		return "/user/getUserList";
	}
	
	@RequestMapping(value="/user/getUserList.do", method=RequestMethod.POST)
	public ModelAndView getUserList() {
		//DB
		List<UserDTO> list = userDAO.getUserList();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("jsonView");
		return mav;
	}
}











