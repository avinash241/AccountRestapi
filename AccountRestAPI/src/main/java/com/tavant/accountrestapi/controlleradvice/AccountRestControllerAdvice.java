package com.tavant.accountrestapi.controlleradvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.tavant.accountrestapi.errorresponse.ErrorResponse;
import com.tavant.accountrestapi.exception.AccountNotFoundException;
import com.tavant.accountrestapi.exception.NoDataFoundException;

@ControllerAdvice
public class AccountRestControllerAdvice {

	//@ExceptionHandler(AccountNotFoundException.class)
	
	@ExceptionHandler(NoDataFoundException.class)
	public final ResponseEntity<ErrorResponse> 
	handleAccountNotFoundException(NoDataFoundException e,WebRequest request) {
		List<String> details = new ArrayList<String>();
		details.add(e.getLocalizedMessage());
		
		ErrorResponse errorResponse = new ErrorResponse("INCORRECT REQUEST",details);
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}
}
