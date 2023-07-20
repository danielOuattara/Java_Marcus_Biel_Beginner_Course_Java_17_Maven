package _10_arrrays_and_enums;

import org.daniel._10_arrrays_and_enums.factory.fetch.FetchStatus;

public class ArrayAndEnum {
    static FetchStatus starting = FetchStatus.STARTING;

    public static void main(String[] args) {

        // System.out.println(starting);

        for (Object item : FetchStatus.values()) {
            // System.out.println(item);
            if (item.equals(FetchStatus.STARTING)) {
                System.out.println("Starting !");
            }
            if (item.equals(FetchStatus.PROCESSING)) {
                System.out.println("Processing !");
            }
            if (item.equals(FetchStatus.COMPLETED)) {
                System.out.println("Completed !");
            }
            if (item.equals(FetchStatus.ERROR)) {
                System.out.println("Error !");
            }
        }

        System.out.println("-------------------------------------------------------");

        for (Object item : FetchStatus.values()) {
            // System.out.println(item);
            if (item == FetchStatus.STARTING) {
                System.out.println("Starting !");
            }
            if (item == FetchStatus.PROCESSING) {
                System.out.println("Processing !");
            }
            if (item == FetchStatus.COMPLETED) {
                System.out.println("Completed !");
            }
            if (item == FetchStatus.ERROR) {
                System.out.println("Error !");
            }
        }

    }
}
