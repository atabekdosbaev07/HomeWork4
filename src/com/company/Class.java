package com.company;

public class Class {

    private int number;
    private String soz;
    private int[] massive;


    public Class(){}

    public Class(int san, String soz, int[] mas){
            this.number=san;
            this.soz=soz;
            this.massive=mas;
    }

    public int getNumber() {
        return number;
    }

    public String getSoz() {
        return soz;
    }

    public int[] getMassive() {
        return massive;
    }


    public void getMassiveuuu(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

    }
}
