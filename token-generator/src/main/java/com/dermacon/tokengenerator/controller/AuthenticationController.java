package com.dermacon.tokengenerator.controller;

import com.dermacon.tokengenerator.exception.EntityNotFoundException;
import com.dermacon.tokengenerator.request.AuthenticationRequest;
import com.dermacon.tokengenerator.response.JWTTokenResponse;
import com.dermacon.tokengenerator.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity createCustomer(@RequestBody AuthenticationRequest request) {
        JWTTokenResponse tokenResponse = authenticationService.generateJWTToken(
                request.getUsername(),
                request.getPassword()
        );
        return new ResponseEntity<>(tokenResponse , HttpStatus.OK);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity handleEntityNotFoundException(EntityNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
