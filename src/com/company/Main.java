package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * 初始化二维数组
         * 并且进行赋值
         */
        int[][] array=new int[11][11];
        array[1][2]=1;
        array[2][3]=2;
        array[2][4]=2;
        System.out.println("原始数组：");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println("压缩后");
        int[][] close = MyArray.close(array);
        for (int[] ints : close) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println("解压后");
        int[][] open = MyArray.open(close);
        for (int[] ints : open) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
