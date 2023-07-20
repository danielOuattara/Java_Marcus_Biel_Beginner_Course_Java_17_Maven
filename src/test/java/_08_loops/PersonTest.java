package _08_loops;


import org.daniel._08_loops.person.Person;
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
}
