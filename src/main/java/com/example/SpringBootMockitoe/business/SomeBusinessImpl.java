package com.example.SpringBootMockitoe.business;

import com.example.SpringBootMockitoe.data.SomeDataService;

public class SomeBusinessImpl {
    private SomeDataService someDataServie;

    public void setSomeDataServie(SomeDataService someDataServie) {
        this.someDataServie = someDataServie;
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for(int value:data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsinDataServie() {
        int sum = 0;
        int[] data=someDataServie.retrieveAllData();
        for(int value:data) {
            sum += value;
        }
        return sum;
    }
}
