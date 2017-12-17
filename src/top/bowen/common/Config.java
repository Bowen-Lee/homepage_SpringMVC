package top.bowen.common;

/**
 * @author usky_Bowen
 *
 */
public class Config {
	
	/**
	 * 上传最大限制
	 */
	private int allowFileSize;// 上传最大限制
	/**
	 * 背景图片储存路径
	 */
	private String ImgUrl;//

	/**
	 * 上传最大限制
	 * @return 单位M*1024*1024
	 */
	public int getAllowFileSize() {
		return allowFileSize*1024*1024;
	}

	public void setAllowFileSize(int allowFileSize) {
		this.allowFileSize = allowFileSize;
	}

	public String getImgUrl() {
		return ImgUrl;
	}

	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}


}
