/**
 * 
 */
package com.dnb.app.exception;

import org.springframework.http.HttpStatus;

/**
 * @author
 *
 * @Aug 25, 2016
 *
 * @TODO :
 */


@SuppressWarnings("serial")
public class ServiceException extends Exception {
	
	private HttpStatus statusCode;
	
	private String exceptionMessage;
	
	private String exceptionSeverity;

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getExceptionSeverity() {
		return exceptionSeverity;
	}

	public void setExceptionSeverity(String exceptionSeverity) {
		this.exceptionSeverity = exceptionSeverity;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public ServiceException(HttpStatus statusCode, String exceptionMessage,
			String exceptionSeverity) {
		this.statusCode = statusCode;
		this.exceptionMessage = exceptionMessage;
		this.exceptionSeverity = exceptionSeverity;
	}

	
}
