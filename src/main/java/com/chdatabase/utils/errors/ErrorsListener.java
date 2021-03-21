package com.chdatabase.utils.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.chdatabase.utils.data_structures_for_messages.MessageContainerWhenErrorOccurred;
import com.chdatabase.utils.data_structures_for_messages.PrincipalMessageContainer;
import com.chdatabase.utils.errors.types.EmptyResultList;
import com.chdatabase.utils.errors.types.InvalidCharacterData;
import com.chdatabase.utils.errors.types.InvalidString;

@RestControllerAdvice
public class ErrorsListener extends ResponseEntityExceptionHandler { 
	
	@ExceptionHandler(InvalidString.class)
	public PrincipalMessageContainer errorString(InvalidString invalidStr) {
		return new PrincipalMessageContainer(new MessageContainerWhenErrorOccurred(invalidStr.getMessage(), invalidStr.getCause().getMessage(), HttpStatus.BAD_REQUEST.value()));
	}
	
	@ExceptionHandler(EmptyResultList.class)
	public PrincipalMessageContainer errorString(EmptyResultList emptyResult) {
		return new PrincipalMessageContainer(new MessageContainerWhenErrorOccurred(emptyResult.getMessage(), emptyResult.getCause().getMessage(), HttpStatus.NOT_FOUND.value()));
	}
	
	@ExceptionHandler(InvalidCharacterData.class)
	public PrincipalMessageContainer errorString(InvalidCharacterData invalidData) {
		return new PrincipalMessageContainer(new MessageContainerWhenErrorOccurred(invalidData.getMessage(), invalidData.getCause().getMessage(), HttpStatus.FORBIDDEN.value()));
	}
}
