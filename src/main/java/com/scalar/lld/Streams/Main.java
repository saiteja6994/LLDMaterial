package com.scalar.lld.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers=new ArrayList<>();
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println(evenNumbers);
        System.out.println(numbers.stream().filter((num)->num%2==0).toList());
    }
}
