package ua.share.exp.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.share.exp.api.models.Message;

@RestController
@RequestMapping(value = "demo")
class HomeController {
    @GetMapping(value = "/hello")
    public ResponseEntity<?> helloWorld(@RequestParam(name = "firstName", required = false) String firstName) {
        final Message message = new Message("Hello World!");

        if (firstName != null) {
            message.setText("Hello " + firstName);
        }

        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
