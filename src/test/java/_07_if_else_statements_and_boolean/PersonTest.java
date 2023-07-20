package _07_if_else_statements_and_boolean;


import org.daniel._07_if_else_statements_and_boolean.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
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
    void demonstrateBoolean() {

    }
}
