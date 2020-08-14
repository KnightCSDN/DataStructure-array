package com.company;


public class MyArray {
    public static int[][] close(int[][] array){
        int sum=0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt!=0){
                    sum++;
                }
            }
        }
        int[][] array1=new int[sum+1][3];
        array1[0][0]=array.length;
        array1[0][1]=array[0].length;
        array1[0][2]=sum;
        int num=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]!=0){
                    num++;
                    array1[num][0]=i+1;
                    array1[num][1]=j+1;
                    array1[num][2]=array[i][j];
                }
            }
        }
        return array1;
    }

    public static int[][] open(int[][] array){
        int[][] array1=new int[array[0][0]][array[0][1]];
        int sum=0;
        for (int i = 1; i < array.length; i++) {
            array1[array[i][0]][array[i][1]]=array[i][2];
        }
        return array1;
    }
}
