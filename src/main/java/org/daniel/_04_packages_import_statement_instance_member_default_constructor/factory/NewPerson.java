package org.daniel._04_packages_import_statement_instance_member_default_constructor.factory;

public class NewPerson {

    String _name;

    public NewPerson(String name) {
        this._name = name;
    }

    public String say_my_name (){
        return this._name;
    }

}
