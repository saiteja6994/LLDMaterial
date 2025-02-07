package com.scalar.lld.DesignPatterns.Builder;

import com.scalar.lld.DesignPatterns.Builder.BuilderDes.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    String name;
    int age;
    int gradYear;
    String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student(Builder builder) {
        if(builder.getAge()<20){
            throw new RuntimeException("Age must be greater than 19");
        }

        if(builder.getGradYear()<2024){
            throw new RuntimeException("GradYear must be greater than 2024");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }
}
