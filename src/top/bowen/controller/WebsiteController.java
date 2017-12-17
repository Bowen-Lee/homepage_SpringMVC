package top.bowen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.bowen.common.BaseComponent;
import top.bowen.service.ImgService;
import vo.UniResult;

@Controller
@RequestMapping("/website")
public class WebsiteController extends BaseComponent{
	
	@Autowired
	private ImgService imgService;
	
	
	
	@ResponseBody
	@RequestMapping(value="",method= RequestMethod.POST)
	public UniResult<Object> haha(@RequestBody MultipartFile file) {
		return imgService.doBackGrountImg(file);
	}
}
