package com.BikkadIT.SpringMvcFirstApp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodMorningController {
	
	
	@GetMapping("/gmMessage") // used for URL
public String  gmMsg(Model model) {
	String goodMorningMsg="Good Morning All";
	model.addAttribute("GMMSG",goodMorningMsg);
	
	return "Morning";
	
}
}
