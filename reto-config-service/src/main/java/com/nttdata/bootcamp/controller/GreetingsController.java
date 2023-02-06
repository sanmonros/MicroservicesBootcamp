package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class GreetingsController {

	@Value("${message.hi-bootcamp")
	private String hiBootcamp;
	
	@GetMapping("/greetings")
	public @ResponseBody String showMessage() {
		return this.hiBootcamp;
	}
	
	
}
