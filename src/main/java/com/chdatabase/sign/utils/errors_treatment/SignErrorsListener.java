package com.chdatabase.sign.utils.errors_treatment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chdatabase.sign.utils.errors_treatment.errors_types.InvalidSignFields;
import com.chdatabase.sign.utils.errors_treatment.errors_types.SaveInDatabaseException;
import com.chdatabase.utils.response.ContainerForErrorsFromOperations;
import com.chdatabase.utils.response.ResponseContainer;

@RestControllerAdvice
public class SignErrorsListener {

	@ExceptionHandler(SaveInDatabaseException.class)
	public ResponseContainer saveInDatabaseError(SaveInDatabaseException sde) {
		sde.errorDescription();
		return new ResponseContainer(new ContainerForErrorsFromOperations(sde.getMessage(), sde.getCause().getMessage()), HttpStatus.FORBIDDEN.value());
	}
	
	@ExceptionHandler(InvalidSignFields.class)
	public ResponseContainer invalidSignFields(InvalidSignFields isf) {
		isf.errorDescription();
		return new ResponseContainer(new ContainerForErrorsFromOperations(isf.getMessage(), isf.getCause().getMessage()), HttpStatus.METHOD_NOT_ALLOWED.value());
	}
	
}
