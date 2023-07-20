package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.springhomework.controller.HomeController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	public HomeController() {
		log.info("실행");
	}
	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		log.info("실행");
=======
		log.info("실행1");
		log.info("실행2");
		log.info("실행3");
		log.info("실행4");
>>>>>>> branch 'master' of https://github.com/space8033/springhomework.git
		
		return "home";
	}
}
