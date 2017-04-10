package com.zenisliu.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zenisliu on 17/4/10.
 * Java can not create Generaic array!
 * Use ArrayList for instead
 */

class Peel<T> {
    T t;
}

class Banana {
}

public class Exercise9 {
    public static void main(String[] args) {
        // Peel<Banana>[] peels = new Peel<Banana>[10]; // Generic array creation error!
        List<Peel<Banana>> peels = new ArrayList<Peel<Banana>>();
    }
}
