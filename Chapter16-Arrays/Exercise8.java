package com.zenisliu.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zenisliu on 17/4/10.
 * Arrya's type would be checked during compile and run time
 * you can put any kind of values into an object array
 */
public class Exercise8 {

    public static void main(String[] args) {
        String[] s = new String[10];
        s[0] = "123"; // OK
        // s[1] = 123;   // Incompatible types error!
        Object[] o = new Object[10];
        o[0] = "123";
        o[1] = 123;
    }
}
