package org.daniel._04_packages_import_statement_instance_member_default_constructor.person;


import org.daniel._04_packages_import_statement_instance_member_default_constructor.factory.NewPerson;

public class Person {
    private NewPerson person_1;  // instance field


    public static void main(String[] args) {

        NewPerson daniel = new NewPerson("daniel");
        System.out.println(daniel.say_my_name());

    }

    public Person() { // constructor
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

}