package _11_enums_and_switch;


import org.daniel._09_for_each_loops_and_arrays.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    static final String[] FETCHING_STATE = {"STARTING", "PROCESSING", "COMPLETED", "ERROR"};

    @Test
    public void shouldReturnHelloWorld() {
        Person daniel = new Person();
        assertEquals("Hello World", daniel.helloWorld());
    }

    @Test
    public void shouldReturnHelloToInputValue() {
        Person person_2 = new Person();
        assertEquals("Hello John", person_2.helloTo("John"));

        Person person_3 = new Person();
        assertEquals("Hello Anna", person_3.helloTo("Anna"));
    }

    @Test
    public void shouldReturnNumberOfInstancesCreated() {
        Person person_1 = new Person();
        Person person_2 = new Person();
        Person person_3 = new Person();
        assertEquals(3, Person.numberOfInstanceCreated());
    }

    @Test
    public void shouldReturnNumberOfInstancesCreatedInForLoop() {
        for (int i = 0; i < 3; i++) {
            Person person = new Person();
        }
        assertEquals(3, Person.numberOfInstanceCreated());
    }

    @Test
    public void shouldReturnNumberOfInstancesCreatedInWhileLoop() {
        int i = 0;
        while (i < 3) {
            Person person = new Person();
            i++;
        }
        assertEquals(3, Person.numberOfInstanceCreated());
    }

    @Test
    public void shouldReturnNumberOfInstancesCreatedInDoWhileLoop() {
        int i = 0;
        do {
            Person person = new Person();
            i++;
        } while (i < 3);
        assertEquals(3, Person.numberOfInstanceCreated());
    }

    @Test
    void demonstrateBoolean() {

    }

    @Test
    public void demonstrateWithArrays() {
        // fixed array size
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        assertEquals(3, Person.numberOfInstanceCreated());
    }


    @Test
    public void demonstrateWithArraysForLoop() {
        // fixed array size
        Person[] persons = new Person[3];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].helloWorld(); // accessible
        }
        assertEquals(3, Person.numberOfInstanceCreated());
    }


    @Test
    public void demonstrateWithArraysForEach() {
        // fixed array size
        Person[] persons = new Person[3];
        for (Person item : persons) {
            item = new Person();
            item.helloWorld(); // accessible
        }
        assertEquals(3, Person.numberOfInstanceCreated());
    }

    @Test
    public void demonstrateWithDynamicArrays() {
        // dynamic array size
        Person person_1 = new Person();
        Person person_2 = new Person();
        Person person_3 = new Person();
        Person[] persons = {person_1, person_2, person_3};
        assertEquals(3, Person.numberOfInstanceCreated());
    }


    public static void finalArrays() {
            for (String state : FETCHING_STATE) {
                System.out.println(state);
            }
        }

    public static void main(String[] args) {
        finalArrays();
    }





}
