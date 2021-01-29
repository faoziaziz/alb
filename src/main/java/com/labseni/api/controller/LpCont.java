package com.labseni.api.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.Date;
@Controller
public class LpCont {

	private String appMode;
	@RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "labseni");
       	model.addAttribute("mode", appMode);

        return "index";
    }

	@GetMapping("/test")
	public String test(){
		return "greeting";
	}

}
