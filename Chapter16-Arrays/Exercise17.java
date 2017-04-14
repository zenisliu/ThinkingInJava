package com.zenisliu.chapter16;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/14.
 * Create and test a Generator for BigDecimal,
 * and ensure that it works with the Generated methods.
 */
class BigDecimalGenerator {

    public static class BigDecimal implements Generator<java.math.BigDecimal> {
        public java.math.BigDecimal next() {
            return new java.math.BigDecimal(1234567890);
        }
    }

}

class TestArrayGeneration {
    public static void test() {
        java.math.BigDecimal[] bd = Generated.array(java.math.BigDecimal.class, new BigDecimalGenerator.BigDecimal(), 10);
        System.out.println(Arrays.toString(bd));
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        TestArrayGeneration.test();
    }
}

