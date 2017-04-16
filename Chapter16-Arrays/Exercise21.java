package com.zenisliu.chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zenisliu on 17/4/16.
 * Try to sort an array of the objects in Exercise 18.
 * Implement Comparable to fix the problem.
 * Now create a Comparator to sort the objects into reverse order.
 */

class BerrylliumSphere2 implements Comparable<BerrylliumSphere2> {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return "Sphere" + id;
    }

    public BerrylliumSphere2(long counter) {
        this.counter = counter;
    }

    private static Random r = new Random(47);
    public static Generator<BerrylliumSphere2> generator() {
        return new Generator<BerrylliumSphere2>() {
            @Override
            public BerrylliumSphere2 next() {
                return new BerrylliumSphere2(r.nextInt(100));
            }
        };
    }

    public int compareTo(BerrylliumSphere2 b) {
        return id < b.id ? -1 : (id == b.id ? 0 : 1);
    }

}

public class Exercise21 {
    public static void main(String[] args) {
        BerrylliumSphere2[] b = Generated.array(new BerrylliumSphere2[12], BerrylliumSphere2.generator());
        System.out.println("before sort:");
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("after sort:");
        System.out.println(Arrays.toString(b));
    }
}

