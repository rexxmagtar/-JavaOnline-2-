package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_5 {

    public static void main(String[] args) {

        int N;


        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер последовательности");
        N=reader.nextInt();
        int [] A=new int[N];


        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();



        }




        System.out.print("Правильные числа  ");

        for(int i=0;i<N;i++){

            if(A[i]>i+1)
            System.out.print(A[i]+", ");

        }















    }
}
