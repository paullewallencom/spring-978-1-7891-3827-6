//video-7_2_start
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("user", "Petra");
		return "index";
	}
	
	
}
//video-7_2_end