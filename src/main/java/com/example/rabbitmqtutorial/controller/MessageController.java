package com.example.rabbitmqtutorial.controller;

import com.example.rabbitmqtutorial.models.Student;
import com.example.rabbitmqtutorial.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MessageController {

    @Autowired
    private SenderService senderService;

    @GetMapping(value ="/students")
    public String getMessages(@RequestParam("studentName") String studentName){
        Student student = new Student();
        student.setStudentName(studentName);
        student.setStudentStd("IIT");
        student.setDocLink("http://doclink");
        senderService.sendData(student);
        return "message send";
    }

}
