package com.scalar.lld.DesignPatterns.Builder.Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String gender;

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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.psp = student.getPsp();
        this.gender = student.getGender();

    }
    public Student() {}
    @Override
    public Student clone() {
        Student copy=new Student(this);
        return null;
    }
}
