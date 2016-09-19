package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "Das Boot, reporting for duty!";
	}
	@RequestMapping("/api/v1/shipwrecks")
	@ResponseBody
	public String api(){
		return "API-Das Boot, reporting for duty!";
	}
}
