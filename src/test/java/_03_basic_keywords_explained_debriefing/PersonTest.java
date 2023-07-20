package _03_basic_keywords_explained_debriefing;

import org.daniel._03_basic_keywords_explained_debriefing.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld() {
        Person daniel = new Person();
        assertEquals("Hello World", daniel.helloWorld());
    }
}
