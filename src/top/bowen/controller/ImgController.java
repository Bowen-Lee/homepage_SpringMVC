package top.bowen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import top.bowen.common.BaseComponent;
import top.bowen.service.ImgService;
import vo.UniResult;

/**
 * @author usky_Bowen
 *	图片处理
 */
@Controller
@RequestMapping("/img")
public class ImgController extends BaseComponent{
	
	@Autowired
	private ImgService imgService;
	
	/**保存图片
	 * @param file
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value= "/doBackGrountImg",method=RequestMethod.POST)
	public Object doBackGrountImg(@RequestBody MultipartFile file) {
		UniResult<String> doBackGrountImg = imgService.doBackGrountImg(file);
		return doBackGrountImg;
	}
	
	/**上传文件测试
	 * @param file
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value= "/test.do",method=RequestMethod.GET)
	public Object test(@RequestParam String str) {
		return ok(str);
	}
}
