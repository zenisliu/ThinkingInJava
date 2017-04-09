package com.zenisliu.chapter16;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zenisliu on 17/4/8.
 * create a 2-dimensional double array
 * and give each value of the array between min and max
 */
public class Exercise3 {

    private static double[][] create2dArray(int d1, int d2, int min, int max) {
        if (d1 < 0 || d2 < 0 || min > max) {
            System.out.println("bad parameter!");
            return null;
        }
        double[][] d = new double[d1][d2];
        Random rand = new Random(47);
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                d[i][j] = min + (max - min)*rand.nextDouble();
            }
        }
        return d;
    }

    private static void printArray(double[][] d) {
        System.out.println(Arrays.deepToString(d)); // 多维数组转换为字符串需要使用Arrays.deepToString方法
    }

    public static void main(String[] args) {
//        int[][][] a = new int[3][2][5];             // 多维数组可以直接这样new,系统会分配三个维度的空间,并将每个reference或者value初始化
//        System.out.println(Arrays.deepToString(a)); // 多维数组转换为字符串需要使用Arrays.deepToString方法
//        System.out.println(Arrays.toString(a));     // 如果使用Arrays.toString方法,输出的将是类似[[[I@150ac9a8, [[I@153e5454, [[I@2f1261b1]
//        printArray(create2dArray());
        printArray(create2dArray(2,3,0,9));
    }
}
