package com.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String view()
	{
		return "page2";
	}
	
	@RequestMapping("/page2")
	public String viewPage(@RequestParam String pid,@RequestParam String pname,@RequestParam String price,Model model)
	{
		model.addAttribute("pid", pid);
		model.addAttribute("pname",pname);
		model.addAttribute("price", price);
		if(pid=="")
		{
			model.addAttribute("error1","invalid Input");
			return "index";
		}
		if(pname=="")
		{
			model.addAttribute("error2","invalid Input");
			return "index";
		}
		if(price.length()<2)
		{
			model.addAttribute("error3","Price is minimum");
			return "index";
		}
		return "page2";
	}
}
