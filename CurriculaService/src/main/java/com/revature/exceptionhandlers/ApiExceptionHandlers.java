package com.revature.exceptionhandlers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.revature.exceptions.TooManyCategoriesException;

@ControllerAdvice
public class ApiExceptionHandlers {
	
	public static final Logger log = LogManager.getRootLogger();
	
	@ExceptionHandler(value= {TooManyCategoriesException.class})
	public ResponseEntity<Object> TooManyCategories(TooManyCategoriesException e){
		log.catching(e);
		return new ResponseEntity<Object>("Visualization contains too many categories", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = {NullPointerException.class})
	public ResponseEntity<Object> DoesNotExist(NullPointerException e){
		log.catching(e);
		return new ResponseEntity<Object>("The Resource Does Not Exist", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {Throwable.class})
	public ResponseEntity<Object> catchAll(Throwable e){
		log.catching(e);
		return new ResponseEntity<Object>("something Went Wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
