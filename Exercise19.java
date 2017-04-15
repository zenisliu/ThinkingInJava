package com.zenisliu.chapter16;

import java.util.Arrays;

/**
 * Created by zenisliu on 17/4/15.
 * Create a class with an int field that’s initialized from a constructor argument.
 * Create two arrays of these objects, using identical initialization values for each array,
 * and show that Arrays.equals( ) says that they are unequal.
 * Add an equals( ) method to your class to fix the problem.
 */
class TestEqual {
    private int i = 0;
    public TestEqual(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        TestEqual t = (TestEqual)o;
        if (this.i == t.i) {
            return true;
        }
        return false;
    }

    // the equals method in Object.java
    // public boolean equals(Object obj) {
    //    return (this == obj);
    //}
}

public class Exercise19 {
    public static void main(String[] args) {
        TestEqual[] t1 = new TestEqual[10];
        Arrays.fill(t1, new TestEqual(47));
        TestEqual[] t2 = new TestEqual[10];
        Arrays.fill(t2, new TestEqual(47));
        System.out.println(Arrays.equals(t1, t2));
    }
}
