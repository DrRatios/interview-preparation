package com.aleksgolds.interview.preparation.hw1;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setFirstName("Aleksandr")
                .setMiddleName("Aleksandrovich")
                .setLastName("Golubev")
                .setAge(28)
                .setCountry("Russia")
                .setGender("Male")
                .setPhone("72767")
                .setAddress("ZZZ")
                .build();
        System.out.println(person);
        Shape circle = new Circle(2.0);
        Shape triangle = new Triangle(5.0,10.0);
        Shape quadrate = new Quadrate(4.0);
        circle.draw();
        System.out.println(circle.size());
        triangle.draw();
        System.out.println(triangle.size());
        quadrate.draw();
        System.out.println(quadrate.size());

    }
}
