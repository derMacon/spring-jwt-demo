package com.dermacon.securewebapp.controller;

import com.dermacon.securewebapp.model.Account;
import com.dermacon.securewebapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String index() {
        return "hi";
    }

}
