package org.daniel._12_switch_statement;

import org.daniel._11_enums_and_switch.fetch.FetchStatus_2;

public class SwitchClass {

    public static void main(String[] args) {
        FetchStatus_2 state = FetchStatus_2.STARTING;

        int myState = 42;

        switch (state) {
            case STARTING:
                System.out.println("Starting ... !");
                break;

            default:
                System.out.println("Nothing Found");

        }
    }
}
