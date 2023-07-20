package org.daniel._07_if_else_statements_and_boolean.booleans;

public class If_Statement {
    public static void main(String[] args) {
        boolean dayIsMonday = true;
        boolean isRaining = true;
        boolean dayIsFriday = false;

        if (dayIsMonday && isRaining) {
            System.out.println("Monday and raining ");
        }
        if (dayIsMonday || isRaining) {
            System.out.println("Monday and raining ");
            // ---------------------------------------------
        } else if (dayIsFriday) {
            System.out.println("day is Friday ");
        } else {
            System.out.println("day is not Monday not Friday and not raining !");
        }
        // =================================================

        int i = 4;
        int j = 3;
    }
}
