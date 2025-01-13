package com.scalar.lld.FunctionalInterface;
@FunctionalInterface
public interface FunctionalTest {
    void test();

//    void test2();
    default void test1(){
        System.out.println("This is default method");
    }
}
