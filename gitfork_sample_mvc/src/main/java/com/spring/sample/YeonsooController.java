package com.spring.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.BoardService;

@Controller
public class YeonsooController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/soo/yeonsoo", method = RequestMethod.GET)
	public ModelAndView yeonsoo() {
		ModelAndView mav = new ModelAndView();
		int countSoo = boardService.getCount();
		mav.addObject("sooCount", countSoo);
		mav.setViewName("yeonsoo");
		
		return mav;
	}
	
	
}
