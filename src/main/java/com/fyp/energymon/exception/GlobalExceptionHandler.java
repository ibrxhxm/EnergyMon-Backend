package com.fyp.energymon.exception;

import com.fyp.energymon.util.JB;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({RequestSyntaxException.class})
    public ResponseEntity<String> handleRequestSyntaxException(RequestSyntaxException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(JB.buildErrorResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.name(), ex.getMessage()).toString());
    }

    @ExceptionHandler({ResponseStatusException.class})
    public ResponseEntity<String> handleResponseStatusException(ResponseStatusException ex) {
        return ResponseEntity.status(ex.getStatus()).contentType(MediaType.APPLICATION_JSON).body(ex.getReason());
    }

    @ExceptionHandler({ApiException.class})
    public ResponseEntity<String> handleRestApplicationException(ApiException ex) {
        return ResponseEntity.status(ex.getStatus()).contentType(MediaType.APPLICATION_JSON).body(ex.getResponseBody().toString());
    }

}
