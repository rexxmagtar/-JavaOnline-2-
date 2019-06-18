package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_2 {

    public static void main(String[] args) {

        int N;
        int count=0;
        int Z;
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер последовательности");
        N=reader.nextInt();
        int [] A=new int[N];


        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();

        }


        System.out.print("введенная последовательность ");

        for(int i=0;i<N;i++){

            System.out.print(A[i]+", ");

        }


        System.out.println("Введите число Z ");
        Z=reader.nextInt();

       for(int i=0;i<N;i++){

           if(A[i]>Z){
               A[i]=Z;
               count++;

           }

       }

        System.out.print("Измененная последовательность ");

        for(int i=0;i<N;i++){

            System.out.print(A[i]+", ");

        }

        System.out.print("Кол-во замен  "+ count);



    }
}
