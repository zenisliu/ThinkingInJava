package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/9.
 * Demonstrate that multidimensional arrays of nonprimitive types are
 * automatically initialized to null.
 */

public class Exercise5 {
    public static void main(String[] args) {

        // Double will be initialized to null, not 0
        Double[][] d = new Double[2][3];
        System.out.println(Arrays.deepToString(d));

        //  Object will be initialized to null
        BerrylliumSphere[][] b = new BerrylliumSphere[2][3];
        System.out.println(Arrays.deepToString(b));
    }
}
