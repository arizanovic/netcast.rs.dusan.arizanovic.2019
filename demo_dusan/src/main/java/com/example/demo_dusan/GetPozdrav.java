package com.example.demo_dusan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetPozdrav {
	
	@RequestMapping("/pozdrav")
	public @ResponseBody String pozdrav() {
		return "Hello!!!";
	}
	
}
