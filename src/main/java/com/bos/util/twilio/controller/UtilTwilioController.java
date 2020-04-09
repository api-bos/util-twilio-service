package com.bos.util.twilio.controller;

import com.bos.util.twilio.service.UtilTwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/util/twilio")
public class UtilTwilioController {
    @Autowired
    UtilTwilioService service;

    @PostMapping("{token}")
    public String updateToken(@PathVariable("token") String token) {
        System.out.println("Trying Update Token Twilio Service");
        return service.updateToken(token);
    }
}
