package com.zenisliu.chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zenisliu on 17/4/8.
 * create a 3-dimensional double array
 * and give each value of the array between min and max
 */
public class Exercise4 {

    private static double[][][] create2dArray(int d1, int d2, int d3, int min, int max) {
        if (d1 < 0 || d2 < 0 || min > max) {
            System.out.println("bad parameter!");
            return null;
        }
        double[][][] d = new double[d1][d2][d3];
        Random rand = new Random(47);
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                for (int k = 0; k < d3; k++) {
                    d[i][j][k] = min + (max - min)*rand.nextDouble();
                }
            }
        }
        return d;
    }

    private static void printArray(double[][][] d) {
        System.out.println(Arrays.deepToString(d)); // 多维数组转换为字符串需要使用Arrays.deepToString方法
    }

    public static void main(String[] args) {
        printArray(create2dArray(2,3,4,0,9));
    }
}

