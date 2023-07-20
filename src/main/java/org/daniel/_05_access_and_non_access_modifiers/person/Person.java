package org.daniel._05_access_and_non_access_modifiers.person;


import org.daniel._05_access_and_non_access_modifiers.factory.NewPerson;

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