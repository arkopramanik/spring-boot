package com.sagility.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sagility.model.ErrorInfo;

@RestControllerAdvice
public class RestControllerAdviceExceptionHandler {
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleException(UserNotFoundException exception){
		String message = exception.getMessage();
		ErrorInfo errorInfo= new ErrorInfo("SBIEX0001", message, LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception exception){
		String message = exception.getMessage();
		ErrorInfo errorInfo= new ErrorInfo("SBIEX0003", message, LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	
}
