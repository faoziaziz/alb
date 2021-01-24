package com.labseni.api.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LpCont {

	@RequestMapping("/")
	public String index() {
		return "index";
	
	}

	@GetMapping("/test")
	public String test(){
		return "greeting";
	}

}
