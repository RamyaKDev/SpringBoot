package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ExceptionController {
@GetMapping("/account/{accountId}")
public ResponseEntity<Account> display(@PathVariable String accountId) {
	Account account=new Account();
	account.setAccountId(accountId);
	account.setAccountName("My Account");
	
	if(accountId.equals("1")) {
		throw new IllegalArgumentException();
	}
	
	if(accountId.equals("2")) {
		throw new IllegalStateException();
	}
	
	
	return new ResponseEntity<>(account,HttpStatus.OK);                                           
}

@ExceptionHandler(IllegalStateException.class)
public ResponseEntity<Account> getException(IllegalStateException e) {
	
	return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	
}
@ExceptionHandler(IllegalArgumentException.class)
public ResponseEntity<Account> getException(IllegalArgumentException e) {
	
	return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	
}
}
