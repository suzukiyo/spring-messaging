package com.example.demo.application.service;

import com.example.demo.domain.model.Event;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Subscriber {

    @EventListener
    public void onAlways(Event event) {
        System.out.println("onAlways:" + event.getValue());
    }

    @EventListener(condition = "#event.result")
    public void onSuccess(Event event) {
        System.out.println("onSuccess:" + event.getValue());
    }

    @EventListener(condition = "!#event.result")
    public void onFailure(Event event) {
        System.out.println("onFailure:" + event.getValue());
    }
}
