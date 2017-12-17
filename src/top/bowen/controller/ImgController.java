package top.bowen.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/MI/img")
@SuppressWarnings("unused")
public class ImgController extends BaseComponent{
	private static final Logger LOGGER = LoggerFactory.getLogger(WebsiteController.class);
	
	@Autowired
	private ImgService imgService;
	
	/**保存图片
	 * @param file
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value= "/doBackGrountImg",method=RequestMethod.POST)
	public UniResult<Object> doBackGrountImg(@RequestBody MultipartFile file) {
		return imgService.doBackGrountImg(file);
	}
	
	/**上传文件测试
	 * @param file
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value= "/test",method=RequestMethod.POST)
	public UniResult<Object> test(@RequestBody MultipartFile file) {
		return ok(file.getName());
	}
}