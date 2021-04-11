package com.chdatabase.utils.errors_treatment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chdatabase.utils.errors_treatment.errors_types.EmptyContentPointerException;
import com.chdatabase.utils.errors_treatment.errors_types.NullPointerExceptionCustomized;
import com.chdatabase.utils.response.ResponseContainer;

@RestControllerAdvice
public class ErrorsListener {
	
	@ExceptionHandler(EmptyContentPointerException.class)
	public ResponseContainer emptyContentError(EmptyContentPointerException ecpe) {
		ecpe.errorDescription();
		return new ResponseContainer(new ErrorMessageContainer(ecpe.getMessage(), ecpe.getStackTrace()), HttpStatus.NOT_ACCEPTABLE.value());
	}
	
	@ExceptionHandler(NullPointerExceptionCustomized.class)
	public ResponseContainer emptyContentError(NullPointerExceptionCustomized npe) {
		npe.errorDescription();
		return new ResponseContainer(new ErrorMessageContainer(npe.getMessage(), npe.getStackTrace()), HttpStatus.NOT_ACCEPTABLE.value());
	}
	
}
