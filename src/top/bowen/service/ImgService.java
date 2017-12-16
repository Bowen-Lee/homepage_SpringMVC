package top.bowen.service;

import org.springframework.web.multipart.MultipartFile;

import vo.Result;

public interface ImgService {
	public Result doBackGrountImg(MultipartFile file);
}
