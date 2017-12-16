package top.bowen.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/MI/website")
public class WebsiteController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebsiteController.class);
	
	@ResponseBody
	@RequestMapping(value="",method= RequestMethod.POST)
	public String haha(@RequestBody File file,HttpServletRequest request) {
		
		return "asd";
	}
}
