package top.bowen.service;

import org.springframework.web.multipart.MultipartFile;

import vo.UniResult;

public interface ImgService {
	
	public UniResult<String> doBackGrountImg(MultipartFile file);

}
