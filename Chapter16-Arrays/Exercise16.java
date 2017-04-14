package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/14.
 * Starting with CountingGenerator.java, create a SkipGenerator class that produces new values
 * by incrementing according to a constructor argument.
 * Modify TestArrayGeneration.java to show that your new class works correctly.
 */
class SkipGenerator {
    public static class Integer implements Generator<java.lang.Integer> {
        private static java.lang.Integer start = 0;
        public Integer(java.lang.Integer start) {
            this.start = start;
        }
        public java.lang.Integer next() {
            start++;
            return start;
        }
    }
}

class TestArrayGeneration {
    public static void test() {
        int[] i = ConvertTo.primitive(Generated.array(java.lang.Integer.class, new SkipGenerator.Integer(15), 10));
        System.out.println(Arrays.toString(i));
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        TestArrayGeneration.test();
    }
}
