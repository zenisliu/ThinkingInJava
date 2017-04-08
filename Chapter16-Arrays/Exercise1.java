package com.zenisliu.chapter16;

/**
 * Created by zenisliu on 17/4/8.
 * Java Array:
 *   1. Aggregate Initialization (static) MUST be used in the definition of an array
 *   2. Dynamic Aggregate Initialization can be used in ANY place that an array is needed
 */
class BerrylliumSphere {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere" + id;
    }
}

public class Exercise1 {

    private static void test(BerrylliumSphere[] b) {
        System.out.println("I am a method, param type is BerrylliumSphere array");
    }

    public static void main(String[] args) {
        // OK, Aggregate Initialization
        BerrylliumSphere[] a = {new BerrylliumSphere(), new BerrylliumSphere()};
        // OK, but use Dynamic Aggregate Initialization is redundant
        BerrylliumSphere[] b = new BerrylliumSphere[] {new BerrylliumSphere(), new BerrylliumSphere()};
        // OK, use Dynamic Aggregate Initialization here is good
        test(new BerrylliumSphere[] {new BerrylliumSphere(), new BerrylliumSphere()});
        // Bad!! can't use this kind of Aggregate Initialization here
        // test({new BerrylliumSphere(), new BerrylliumSphere()});
    }
}

