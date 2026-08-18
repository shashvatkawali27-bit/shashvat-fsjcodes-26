/*
    Name:Shashvat Kawali
    Aim:Programs on various types of inheritance and
    Exception handling.
    Class:SE Comps A

*/

public class Person {
    private String name;
    private int age;
    private String gender;
    private double height;

    Person(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    void display() {
        System.out.println("name" + this.name);
        System.out.println("age" + this.age);
        System.out.println("gender" + this.gender);
        System.out.println("height" + this.height);
    }
}
