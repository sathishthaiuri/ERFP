/**
 * 
 */
package com.dnb.app.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 
 *
 * @Aug 25, 2016
 *
 * @TODO : Controller for RiskProfilingController
 */
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ExceptionMessage handleServiceException(
			ServiceException serviceException, HttpServletResponse response)
			throws IOException {

		ExceptionMessage exceptionMessage = new ExceptionMessage();
		
		exceptionMessage.setHttpStatus(serviceException.getStatusCode());
		exceptionMessage.setExceptionDescrption(serviceException.getExceptionMessage());
		exceptionMessage.setExceptionSeverity(serviceException.getExceptionSeverity());
		
		return exceptionMessage;
	}

}
