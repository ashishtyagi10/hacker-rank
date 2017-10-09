package com.thinkin.hackerrank;

import java.util.Scanner;

public class ArrayLeftRotation {

    private static int rotation;

    public static void inputValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total number of element in array :");
        int totalNumber = scanner.nextInt();
        System.out.println("Please enter number of rotation :");
        rotation = scanner.nextInt();
        System.out.println("Please enter elements in array :");
        int array[] = new int[totalNumber];
        for(int i=0;i<totalNumber;i++){
            array[i]= scanner.nextInt();
        }
    }

    public static void main(String ... args){
        int a[]={1,2,3,4,5};
        int r=4;
        rotate(4,a);
    }

    public static void rotate(int rotation, int array[]){
        int temp=array[0];
        int finalPosition=array.length-1;
        for(int i=0;i<rotation;i++){
            for(int j=1;j<array.length;j++){
                array[j-1]=array[j];
            }
            array[finalPosition]=temp;
            temp=array[0];
        }
        System.out.println(printArray(array));
    }

    private static boolean printArray(int[] array) {
        for(int a:array){
            System.out.println(a);
        }
        return true;
    }

}
