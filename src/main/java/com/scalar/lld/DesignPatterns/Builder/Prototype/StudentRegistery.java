package com.scalar.lld.DesignPatterns.Builder.Prototype;

import java.util.HashMap;

public class StudentRegistery {
    private HashMap<String, Student> map= new HashMap<>();
    public void registerStudent(Student student,String key) {
        map.put(key,student);
    }
    public Student getStudent(String key) {
        return map.get(key);
    }
}
