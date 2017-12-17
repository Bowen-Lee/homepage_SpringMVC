package top.bowen.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.bowen.controller.WebsiteController;
import vo.UniResult;

public class BaseComponent {
	protected final Logger LOGGER = LoggerFactory.getLogger(WebsiteController.class);
	/**
	 * ok(通过结果数据，创建一个成功的通用返回结果)
	 * 
	 * @param data
	 * @return
	 */
	public <T> UniResult<T> ok(T data) {
		UniResult<T> result = new UniResult<T>(UniResult.STATUS_OK, UniResult.MESSAGE_OK, data);

		return result;
	}

	/**
	 * ok(创建一个成功的通用返回结果)
	 * 
	 * @return
	 */
	public UniResult<Object> ok() {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_OK, UniResult.MESSAGE_OK, null);

		return result;
	}

	/**
	 * error(创建一个失败的通用返回结果)
	 * 
	 * @return
	 */
	public UniResult<Object> error() {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, UniResult.MESSAGE_ERROR, null);
		return result;
	}

	public UniResult<Object> error(String errorCode, String messagekey) {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, errorCode, messagekey, null);
		return result;
	}

	/**
	 * error(指定结果信息，创建一个失败的通用返回结果)
	 * 
	 * @param msg
	 *            结果信息，使用message key能够进行国际化处理
	 * @return
	 */
	public UniResult<Object> error(String messagekey) {
		UniResult<Object> result = new UniResult<Object>(UniResult.STATUS_ERROR, messagekey, null);
		return result;
	}

	/**
	 * build(指定结果状态、结果信息，创建一个失败的通用返回结果)
	 * 
	 * @param status
	 * @param msg
	 *            结果信息，使用message key能够进行国际化处理
	 * @return
	 */
	public UniResult<Object> build(Integer status, String message) {
		UniResult<Object> result = new UniResult<Object>(status, message, null);

		return result;
	}
}
