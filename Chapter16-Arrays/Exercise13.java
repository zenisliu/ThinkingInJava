package com.zenisliu.chapter16;

/**
 * Created by zenisliu on 17/4/12.
 */

class CountingGenerator {
    
    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    public static class
    Character implements Generator<java.lang.Character> {
        private static int index = -1;
        public java.lang.Character next() {
            index = (index + 1) % chars.length;
            return chars[index];
        }
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        char[] ca = {new CountingGenerator.Character().next(), new CountingGenerator.Character().next()};
        String s = new String(ca);
        System.out.println(s);
    }
}
