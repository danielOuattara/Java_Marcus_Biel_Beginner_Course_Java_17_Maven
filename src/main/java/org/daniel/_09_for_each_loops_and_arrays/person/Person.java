package org.daniel._09_for_each_loops_and_arrays.person;


import org.daniel._09_for_each_loops_and_arrays.factory.NewPerson;

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