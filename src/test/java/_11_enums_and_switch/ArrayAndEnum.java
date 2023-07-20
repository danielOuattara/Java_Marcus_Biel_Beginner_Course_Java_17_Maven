package _11_enums_and_switch;

import org.daniel._10_arrrays_and_enums.fetch.FetchStatus;
import org.daniel._11_enums_and_switch.fetch.FetchStatus_2;

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

        System.out.println("-------------------------------------------------------");

        FetchStatus_2 status2 = FetchStatus_2.STARTING;
        switch (status2) {

            case STARTING:
                System.out.println("Starting");
                break;
            case PROCESSING:
                System.out.println("Processing");
                break;
            case COMPLETED:
                System.out.println("Completed");
                break;
            case ERROR:
                System.out.println("Error");
                System.out.println(status2);
                break;
            default:
                System.out.println("Unknown Request");
        }
    }
}
