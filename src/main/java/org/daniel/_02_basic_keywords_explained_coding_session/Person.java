package org.daniel._02_basic_keywords_explained_coding_session;

import org.daniel._03_basic_keywords_explained_debriefing.Name;

public class Person {
    private Name personName; // instance variable

    public String helloWorld() {  // instance method
        return ("Hello World");
    }

    public Name name() {
        return personName;
    }
}
