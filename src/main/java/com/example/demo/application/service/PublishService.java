package com.example.demo.application.service;

import com.example.demo.domain.model.Event;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublishService {

    ApplicationEventPublisher publisher;

    public void publish(Event event) {
        publisher.publishEvent(event);
    }
}
