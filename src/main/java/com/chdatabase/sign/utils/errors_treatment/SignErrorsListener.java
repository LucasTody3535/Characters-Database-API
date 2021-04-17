package com.chdatabase.sign.utils.errors_treatment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.chdatabase.sign.utils.errors_treatment.errors_types.SaveInDatabaseException;
import com.chdatabase.utils.response.ResponseContainer;

@RestControllerAdvice
public class SignErrorsListener {

	@ExceptionHandler(SaveInDatabaseException.class)
	public ResponseContainer saveInDatabaseError(SaveInDatabaseException sde) {
		sde.errorDescription();
		return new ResponseContainer(sde, HttpStatus.FORBIDDEN.value());
	}
	
}
