package top.bowen.service.imlp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import top.bowen.common.BaseComponent;
import top.bowen.common.Config;
import top.bowen.common.LoadImgType;
import top.bowen.service.ImgService;
import vo.UniResult;

@Service
public class ImgServiceImpl implements ImgService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ImgServiceImpl.class);

	@Autowired
	private BaseComponent baseComponent;

	@Autowired
	@Qualifier("config")
	private Config config; 

	@Override
	public UniResult<String> doBackGrountImg(MultipartFile file) {
		String url= "";
		try {
			url = savePic(file.getInputStream(), file.getOriginalFilename());
		} catch (IOException e) {
			LOGGER.error("解析图片文件出错",e);
			return baseComponent.error("解析图片文件出错");
		}
		return baseComponent.ok(url);
	}
	
	 /**没有限制的文件上传
	 * @param inputStream
	 * @param fileName
	 * @return
	 */
	private String savePic(InputStream inputStream, String fileName) {
		    OutputStream os = null;
		    try {
		      String path = "";
		      // 2、保存到临时文件
		      // 1K的数据缓冲
		      byte[] bs = new byte[1024];
		      // 读取到的数据长度
		      int len;
		      // 输出的文件流保存到本地文件
		 
		      File tempFile = new File(path);
		      if (!tempFile.exists()) {
		        tempFile.mkdirs();
		      }
		      os = new FileOutputStream(tempFile.getPath() + File.separator + fileName);
		      // 开始读取
		      while ((len = inputStream.read(bs)) != -1) {
		        os.write(bs, 0, len);
		      }
		 
		    } catch (IOException e) {
		      e.printStackTrace();
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      // 完毕，关闭所有链接
		      try {
		        os.close();
		        inputStream.close();
		      } catch (IOException e) {
		        e.printStackTrace();
		      }
		    }
		    return File.separator + fileName;
		  }
	 
	  /**单文件上传
	 * @param file
	 * @throws Exception
	 * @author usky_Bowen
	 */
	public String upload(MultipartFile file) throws Exception {
	    try {
	      String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
	      if (LoadImgType.getByCode(suffix)==null) {
	        throw new Exception("请上传允许格式的文件");
	      }
	      if (file.getSize() > config.getAllowFileSize()) {
	       LOGGER.error("您上传的文件大小已经超出范围",new Exception("您上传的文件大小已经超出范围"));
	      }
	      File destFile = new File(config.getImgUrl());
	      if (!destFile.exists()) {
	        destFile.mkdirs();
	      }
	      String fileNameNew =  "image." + suffix;
	      File f = new File(destFile.getAbsoluteFile() + "/" + fileNameNew);
	      file.transferTo(f);
	      f.createNewFile();
	      return config.getImgUrl()  + "/" + fileNameNew;
	    } catch (Exception e) {
	      throw e;
	    }
	  }
}
