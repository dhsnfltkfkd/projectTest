package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.SungJukDTO;

@Controller
public class SungJukController {

	@RequestMapping(value = "/input.do")
	public String input() {
		return "/sungjuk/input";
	}

	@RequestMapping(value = "/result.do", method=RequestMethod.GET)
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		
		model.addAttribute("name", sungJukDTO.getName());
		model.addAttribute("kor", sungJukDTO.getKor());
		model.addAttribute("eng",sungJukDTO.getEng());
		model.addAttribute("math", sungJukDTO.getMath());
		
		return "/sungjuk/result";

	}

}