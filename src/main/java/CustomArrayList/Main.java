package CustomArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {




        Car car1 = new Car(1998,"volvo");
        Car car2 = new Car(1995,"toyota");
        Car car3 = new Car(2005,"bmw");
        Car car4 = new Car(2022,"mers");
        Car car5 = new Car(1998,"dmitsubishi");
        Car car6 = new Car(1102,"cmitsubishi");
        Car car7 = new Car(1900,"bmitsubishi");
        Car car8 = new Car(199133,"mitsubishi");
        Car car9 = new Car(19913,"amitsubishi");



        Array<Car> cars = new CustomArray<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        CustomArraySorting.sort(cars,new SortByAge());
        for(Car car:cars){
            System.out.print(car.getAge() + ", ");
        }
        System.out.println();
      }
}
