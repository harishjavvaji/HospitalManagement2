package com.mypackage.controllers;


import com.mypackage.models.Registration;
import com.mypackage.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;


    @RequestMapping(value = "/registartion")
    public ModelAndView viewRegistration() {

        return new ModelAndView("registration");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute Registration registration) {
        registrationService.registerUser(registration);
        return new ModelAndView("home");


    }
}
