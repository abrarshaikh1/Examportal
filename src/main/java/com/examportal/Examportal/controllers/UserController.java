package com.examportal.Examportal.controllers;

import com.examportal.Examportal.dtos.UserRegDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public String createUser(@RequestBody UserRegDto userRegDto){
        return null;
    }
}
