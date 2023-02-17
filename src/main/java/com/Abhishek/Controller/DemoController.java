package com.Abhishek.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/demo")
public class DemoController {



    @GetMapping("/")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Hey... after all we did it... Congratulations");
    }
    
}
