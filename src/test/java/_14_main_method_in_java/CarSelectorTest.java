package _14_main_method_in_java;

import org.daniel._14_main_method.CarSelector;

import org.junit.jupiter.api.Test;

public class CarSelectorTest {

    @Test
    public  void shouldReturnSomething(){
        String []  brands = {"BMW", "Porsche", "Audi"};
        CarSelector.main(brands);
    }
}
