package com.example.rabbitmqtutorial.models;

public class Student {
    private String studentName;
    private String studentStd;
    private String docLink;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStd() {
        return studentStd;
    }

    public void setStudentStd(String studentStd) {
        this.studentStd = studentStd;
    }

    public String getDocLink() {
        return docLink;
    }

    public void setDocLink(String docLink) {
        this.docLink = docLink;
    }
}
