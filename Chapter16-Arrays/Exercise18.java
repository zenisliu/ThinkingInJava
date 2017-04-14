package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/15.
 * Create and fill an array of BerylliumSphere.
 * Copy this array to a new array and show that it’s a shallow copy.
 */

public class Exercise18 {
    public static void main(String[] args) {
        BerrylliumSphere[] b1 = new BerrylliumSphere[10];
        Arrays.fill(b1, new BerrylliumSphere());
        System.out.println(Arrays.toString(b1));
        BerrylliumSphere[] b2 = new BerrylliumSphere[10];
        System.arraycopy(b1, 0, b2, 0, b2.length );
        System.out.println(Arrays.toString(b2));
        System.out.println(b1[0] == b2[0]); //  the same reference
    }
}
