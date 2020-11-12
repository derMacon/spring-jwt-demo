package com.dermacon.tokengenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String index() {
        return "Login Token generator\nPOST Request Json Body:\n" +
                "{\n" +
                "\tusername: \"yourUsername\"\n" +
                "\tpassword: \"yourPassword\"\n" +
                "}";
    }

}
