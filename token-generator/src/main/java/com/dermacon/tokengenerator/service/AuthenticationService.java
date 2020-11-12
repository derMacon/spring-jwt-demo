package com.dermacon.tokengenerator.service;

import com.dermacon.tokengenerator.exception.EntityNotFoundException;
import com.dermacon.tokengenerator.repository.AccountRepository;
import com.dermacon.tokengenerator.response.JWTTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountRepository accountRepository;


    public JWTTokenResponse generateJWTToken(String username, String password) {
        return accountRepository.findOneByUsername(username)
                .filter(account ->  passwordEncoder.matches(password, account.getPassword()))
                .map(account -> new JWTTokenResponse(jwtTokenService.generateToken(username)))
                .orElseThrow(() ->  new EntityNotFoundException("Account not found"));
    }


}
