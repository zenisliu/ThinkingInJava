package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 *  Created by zenisliu on 17/4/12.
 *  Create an array of each primitive type, then fill each array by using CountingGenerator.
 *  Print each array.    
 */
public class Exercise14 {
    public static void main(String[] args) {
        int[] i = ConvertTo.primitive(Generated.array(java.lang.Integer.class, new CountingGenerator.Integer(), 7));
        System.out.println(Arrays.toString(i));
    }
}
