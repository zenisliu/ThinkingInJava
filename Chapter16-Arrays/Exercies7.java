package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/9.
 */
public class Exercise7 {
    private static BerrylliumSphere[][][] createArray(int a, int b, int c) {
        return new BerrylliumSphere[a][b][c];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createArray(2,3,4)));
    }
}

