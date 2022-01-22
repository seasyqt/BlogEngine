package ru.skillbox.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.blog.api.response.InitResponse;
import ru.skillbox.blog.service.SettingsService;

@RestController
@RequestMapping("/api")
public class ApiGeneralController {

    SettingsService settingsService;

    @GetMapping("/init")
    public ResponseEntity<?> init() {
        return ResponseEntity.ok(new InitResponse());
    }

    @GetMapping("/settings")
    public ResponseEntity<?> checkGlobalSettings() {
        return ResponseEntity.ok(settingsService.getGlogalSettings());
    }

}
