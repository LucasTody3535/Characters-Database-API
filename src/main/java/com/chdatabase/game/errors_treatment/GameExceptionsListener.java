package com.chdatabase.game.errors_treatment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chdatabase.game.errors_treatment.errors_type.InvalidClassGenre;
import com.chdatabase.utils.response.ResponseContainer;

@RestControllerAdvice
public class GameExceptionsListener {

	@ExceptionHandler(InvalidClassGenre.class)
	public ResponseContainer classGenreError(InvalidClassGenre icg) {
		icg.errorDescription();
		return new ResponseContainer(icg, HttpStatus.NOT_ACCEPTABLE.value());
	}
	
}
