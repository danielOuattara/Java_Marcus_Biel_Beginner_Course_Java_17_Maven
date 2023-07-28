package org.daniel._14_main_method;

public class CarSelector {
    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.process("BMW");
        for (String singleArgument : args) {
            new CarService().process(singleArgument);

        }
    }
}
