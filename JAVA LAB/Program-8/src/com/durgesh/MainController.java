package com.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/page2")
	public String page2(@RequestParam String sname , @RequestParam String scourse , Model model) {
		System.out.println("customer name = "+sname);
		model.addAttribute("sname", sname);
		model.addAttribute("scourse",scourse);
		
		return "page2";
	}
}
