package top.bowen.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.bowen.service.ImgService;
import vo.Result;

@Controller
@RequestMapping("/MI/img")
@SuppressWarnings("unused")
public class ImgController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebsiteController.class);
	
	@Autowired
	private ImgService imgService;
	
	@ResponseBody
	@RequestMapping(value= "/doBackGrountImg",method=RequestMethod.POST)
	public Result doBackGrountImg(@RequestBody MultipartFile file) {
		return imgService.doBackGrountImg(file);
	}
}
