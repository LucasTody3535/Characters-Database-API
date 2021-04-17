package com.chdatabase.game.errors_treatment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chdatabase.game.errors_treatment.errors_type.InvalidClassGenre;
import com.chdatabase.game.errors_treatment.errors_type.InvalidPlayerData;
import com.chdatabase.utils.response.ContainerForErrorsFromOperations;
import com.chdatabase.utils.response.ResponseContainer;

@RestControllerAdvice
public class GameExceptionsListener {

	@ExceptionHandler(InvalidClassGenre.class)
	public ResponseContainer classGenreError(InvalidClassGenre icg) {
		icg.errorDescription();
		return new ResponseContainer(new ContainerForErrorsFromOperations(icg.getMessage(), icg.getCause().getMessage()), HttpStatus.NOT_ACCEPTABLE.value());
	}
	
	@ExceptionHandler(InvalidPlayerData.class)
	public ResponseContainer playerDataInvalid(InvalidPlayerData ipd) {
		ipd.errorDescription();
		return new ResponseContainer(new ContainerForErrorsFromOperations(ipd.getMessage(), ipd.getCause().getMessage()), HttpStatus.NOT_ACCEPTABLE.value());
	}
	
}
