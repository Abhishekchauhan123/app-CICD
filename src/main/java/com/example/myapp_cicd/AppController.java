package com.example.myapp_cicd;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @GetMapping("/")
    ResponseEntity<String> app(){
        return ResponseEntity.ok("Hello World !!!!");
    }
}
