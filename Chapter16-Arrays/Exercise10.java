package com.zenisliu.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zenisliu on 17/4/10.
 * Use containers instead of arrays to eliminate the compile-time warnings
 */
public class Exercise10 {
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        // ls[1] = new ArrayList<Integer>(); // Comple-time checking produce an error!

        // The problem: List<String> is a subtype of Object[]
        Object[] objects = ls; // So assignment is OK
        // Compiles and runs without complaint
        objects[1] = new ArrayList<Integer>();

        // However, if your needs are straightforward it is possible to create an array
        // of generics, albeit with an "unchecked" warning
        // List<BerrylliumSphere>[] spheres = (ArrayList<BerrylliumSphere>[])new List[10]; // unchecked cast warning
        List<List<BerrylliumSphere>> spheres = new ArrayList<>(); // use containers to eliminate compile-time warnings
        for (int i = 0; i < spheres.size(); i++) {
            spheres.add(new ArrayList<BerrylliumSphere>());
        }
    }
}
