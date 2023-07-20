package org.daniel._10_arrrays_and_enums.factory.person;


import org.daniel._10_arrrays_and_enums.factory.factory.NewPerson;

public class Person {
    private NewPerson person_1;  // instance field
    private static int instantiationCounter = 0;


    public static void main(String[] args) {

        NewPerson daniel = new NewPerson("daniel");
        System.out.println(daniel.say_my_name());

    }

    public Person() { // constructor
        instantiationCounter++;
        /*Empty on purpose - default constructor*/
    }

    public Person(NewPerson personName) { // constructor
        String super_name = ""; // local variable
        int counter_local = 3; // local variable
        this.person_1 = personName;
    }

    public String helloWorld() { // instance method
        return ("Hello World");
    }

    public String helloTo(String name) { // instance method
        return ("Hello " + name);
    }

    public NewPerson name() {
        return person_1;
    }

    public static int numberOfInstanceCreated() {
        return instantiationCounter;
    }
}