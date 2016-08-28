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


public class ExceptionMessage {
	
	private HttpStatus httpStatus;
	
	private String exceptionDescrption;
	
	private String exceptionSeverity;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getExceptionDescrption() {
		return exceptionDescrption;
	}

	public void setExceptionDescrption(String exceptionDescrption) {
		this.exceptionDescrption = exceptionDescrption;
	}

	public String getExceptionSeverity() {
		return exceptionSeverity;
	}

	public void setExceptionSeverity(String exceptionSeverity) {
		this.exceptionSeverity = exceptionSeverity;
	}
	
}
