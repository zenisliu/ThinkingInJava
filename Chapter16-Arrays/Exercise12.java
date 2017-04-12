package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/12.
 * Create an initialized array of double using CountingGenerator. Print the results.
 */
class CountingGenerator {
    public static class
    Double implements Generator<java.lang.Double> {
        private double value = 0;
        public java.lang.Double next() {
            double result = value;
            value += 1.0;
            return result;
        }
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        double[] d = {new CountingGenerator.Double().next(), new CountingGenerator.Double().next(),
                new CountingGenerator.Double().next()};
        System.out.println(Arrays.toString(d));
    }
}
