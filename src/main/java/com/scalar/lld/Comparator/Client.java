package com.scalar.lld.Comparator;

import java.util.*;

public class Client {
    static class Car {
        public String name;
        public int price;
        public int speed;

        Car(String name, int price, int speed) {
            this.name = name;
            this.price = price;
            this.speed = speed;
        }
        @Override
        public String toString() {
            return "[name = "+this.name+", price = "+this.price+", speed = "+this.speed+" ]\n";
        }

    }
    public static void main(String[] args) {
        Car car1 = new Car("Car 1", 400, 100);
        Car car2 = new Car("Car 2", 200, 100);
        Car car3 = new Car("Car 3", 300, 100);

        List<Car> cars=Arrays.asList(car1, car2, car3);
        Comparator<Car> comparator = (c1,c2)->c1.price - c2.price;
        Collections.sort(cars,comparator);
        System.out.println(cars);
    }
}
