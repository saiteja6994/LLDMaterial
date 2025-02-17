package com.scalar.lld.DesignPatterns.Builder.Prototype;

public class Client {
    public static void fillRegistery(StudentRegistery studentRegistery) {

        Student student1 = new Student();
        student1.setName("shyam");
        student1.setAge(22);
        student1.setGender("Male");
        studentRegistery.registerStudent(student1,"Mar24");

        Student student2 = new Student();
        student2.setName("ram");
        student2.setAge(22);
        student2.setGender("Male");
        studentRegistery.registerStudent(student2,"Mar25");

    }
    public static void main(String[] args) {
        StudentRegistery studentRegistery = new StudentRegistery();
        fillRegistery(studentRegistery);

        Student student=studentRegistery.getStudent("Mar24").clone();
        student.setName("ram");
        student.setAge(22);
        student.setGender("Male");

        System.out.println(student);

    }
}
