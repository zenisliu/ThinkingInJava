package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 *  * Created by zenisliu on 17/4/8.
 *   * Java method can return a array, while C/C++ can't
 *    * This sample illustrates how to create an array in a method and return
 *     * this array, and then print this array as string
 *      */

class BerrylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere" + id;
    }
}

class Exercise2 {

    private static BerrylliumSphere[] createArray(int size) {
        if (size < 0) {
            System.out.println("bad parameter!");
        }
        BerrylliumSphere[] a = new BerrylliumSphere[size];
        for (int i = 0; i < size; i++) {
            a[i] = new BerrylliumSphere();
        }
        return a;
    }

    public static void main(String[] args) {
        BerrylliumSphere[] a = createArray(3);
        System.out.println("The created rray size is: " + a.length
        + ", array to string: " + Arrays.toString(a));
    }
}

