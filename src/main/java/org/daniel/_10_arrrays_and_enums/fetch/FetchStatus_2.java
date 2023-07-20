package org.daniel._10_arrrays_and_enums.fetch;

public enum FetchStatus_2 {
    STARTING(0), PROCESSING(1), COMPLETED(2), ERROR(3);


    private int i;
    FetchStatus_2(int i) {
        this.i = i;
    }
}
