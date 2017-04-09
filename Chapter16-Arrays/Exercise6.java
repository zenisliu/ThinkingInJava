package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/9.
 */
public class Exercise6 {
    private static BerrylliumSphere[][] createArray(int a, int b) {
        return new BerrylliumSphere[a][b];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createArray(2,3)));
    }
}

