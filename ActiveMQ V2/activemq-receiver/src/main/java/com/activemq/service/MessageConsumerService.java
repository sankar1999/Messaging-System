package com.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    @JmsListener(destination = "Next Queue Test")
    public void listener(String name) {
        System.out.println("The Message sent from queue Hello Queue: " + name);
    }
}
