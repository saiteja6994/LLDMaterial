package com.scalar.lld.DesignPatterns.Builder.BuilderDes;

import com.scalar.lld.DesignPatterns.Builder.Student;

public class Client {
    public static void main(String[] args) {
        Builder student=new Builder();
        student.setAge(19);
        student.setName("Jack");
        student.setGradYear(2024);
        student.setPhoneNumber("6305488u43");


        Student student1=new Student(student);
        System.out.println("DEBUG");
    }
}
