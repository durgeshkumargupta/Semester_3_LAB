package com.durgesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/")
	public String firstPage()
	{
		return "index";
	}
	
	@RequestMapping("/page2")
	public String viewPage(@RequestParam String pid,@RequestParam String pname,@RequestParam String price,Model model)
	{
		model.addAttribute("pid", pid);
		model.addAttribute("pname",pname);
		model.addAttribute("price", price);
		
		if(pid=="" || pname=="" || price=="")
		{
			model.addAttribute("BlankPage", "Invaild Input");
			return "index";
		}
		else
		{
		    return "page2";
		}
			
	   
	}
}
