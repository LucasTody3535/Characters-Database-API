package com.chdatabase.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chdatabase.sign.models.SignModel;
import com.chdatabase.utils.response.ResponseContainer;

@Service
@RestController
@RequestMapping(path = "/triages/api")
@CrossOrigin
public class SignServices {

	@Autowired
	private SignController controller;
	
	@PostMapping(consumes = "application/json", produces = "application/json", path = "/sign")
	public ResponseContainer signIntoGame(@RequestBody SignModel model) {
		SignModel created = this.controller.verifyContent(model);
		return new ResponseContainer(created, HttpStatus.CREATED.value());
	}
}
