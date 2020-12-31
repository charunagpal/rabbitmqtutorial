package com.example.rabbitmqtutorial.service;

import com.example.rabbitmqtutorial.models.Student;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${student.rabbitmq.exchange}")
    String exchange;


    @Value("${student.rabbitmq.routingkey}")
    String routingKey;

    public void sendData(Student student) {
        amqpTemplate.convertAndSend(exchange, routingKey,student);
        System.out.println("Send msg = " + student);
    }
}
