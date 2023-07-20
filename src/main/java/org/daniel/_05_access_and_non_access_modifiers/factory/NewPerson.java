package org.daniel._05_access_and_non_access_modifiers.factory;

public class NewPerson {

    String _name;

    public NewPerson(String name) {
        this._name = name;
    }

    public String say_my_name (){
        return this._name;
    }

}
