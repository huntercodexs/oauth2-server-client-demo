package com.huntercodexs.oauth2serverclientdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${api.prefix}")
@CrossOrigin(origins = "*")
public class SampleController {

    @GetMapping(value = "/allowed")
    public ResponseEntity<?> allowed() {
        return ResponseEntity.ok().body("Allowed is running on OAUTH2-SERVER-CLIENT-DEMO");
    }

    @GetMapping(value = "/welcome")
    public ResponseEntity<?> welcome() {
        return ResponseEntity.ok().body("Welcome is running on OAUTH2-SERVER-CLIENT-DEMO");
    }

}
