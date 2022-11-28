package com.application1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendService {
    private JmsTemplate jmsTemplate;

    @Autowired
    private SendService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendName(String name) {
        jmsTemplate.convertAndSend("Hello World", name);
    }
}
