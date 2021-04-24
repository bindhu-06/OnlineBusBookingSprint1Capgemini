package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OnlineBusBookingController  {
	@ExceptionHandler(value = UsernameAlreadyExistsException.class)
	public ResponseEntity<Object> handleException(UsernameAlreadyExistsException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.CONFLICT);
	}
	@ExceptionHandler(value = InvalidUsernameException.class)
	public ResponseEntity<Object> handleException(InvalidUsernameException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = UsernameNotFoundException.class)
	public ResponseEntity<Object> handleException(UsernameNotFoundException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = InvalidBusOperatorException.class)
	public ResponseEntity<Object> handleException(InvalidBusOperatorException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus. BAD_REQUEST);
	}
	@ExceptionHandler(value = InvalidRouteNameException.class)
	public ResponseEntity<Object> handleException(InvalidRouteNameException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = BusOperatorValidationException.class)
	public ResponseEntity<Object> handleException(BusOperatorValidationException exception) {
		return new ResponseEntity<>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = BusNotFoundException.class)
	public ResponseEntity<Object> handleException(BusNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}
