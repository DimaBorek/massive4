package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        double medArray1 = 1;
        int[] array2 = new int[5];
        double medArray2 = 2;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            medArray1 += array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            medArray2 += array2[i];
            System.out.print(array2[i] + " ");
        }
        medArray1 /= 5;
        medArray2 /= 5;
        System.out.println();
        if (medArray1<medArray2)
            System.out.println("medArray1<medArray2");
        else if (medArray1>medArray2)
            System.out.println("medArray1>medArray22");
        else if (medArray1==medArray2)
            System.out.println("medArray1=medArray2");
    }

}
