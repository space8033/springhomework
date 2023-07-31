package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.springhomework.dto.Ch04Dto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/ch13")
public class Ch13Controller {
	
	@RequestMapping("/content")
	public String content() {
		
		return "ch13/content";
	}
	
	@GetMapping("/insertBoard")
	public String insertBoard() {
		
		return "redirect:/ch13/content";
	}
	@GetMapping("/getBoardList")
	public String getBoardList() {
		
		return "redirect:/ch13/content";
	}
	@GetMapping("/updateBoard")
	public String updateBoard() {
		
		return "redirect:/ch13/content";
	}
	@GetMapping("/deleteBoard")
	public String deleteBoard() {
		
		return "redirect:/ch13/content";
	}
}
