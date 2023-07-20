package _06_tools_intellij_idea_junit_maven;


import org.daniel._06_tools_intellij_idea_junit_maven.person.Person;
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
}
