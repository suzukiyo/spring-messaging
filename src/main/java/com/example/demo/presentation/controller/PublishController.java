package com.example.demo.presentation.controller;

import com.example.demo.application.service.PublishService;
import com.example.demo.domain.model.Event;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PublishController {

    PublishService publishService;

    @GetMapping("/")
    void publish() {
        publishService.publish(new Event());
    }
}
