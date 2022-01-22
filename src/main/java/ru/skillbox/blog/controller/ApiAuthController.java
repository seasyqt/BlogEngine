package ru.skillbox.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.blog.api.response.CheckAuthResponse;

@RestController
@RequestMapping("/api/auth")
public class ApiAuthController {

    @GetMapping("/check")
    public ResponseEntity<?> checkAuth() {
        return ResponseEntity.ok(new CheckAuthResponse());
    }

}
