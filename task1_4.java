package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_4 {

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

        int Min=A[0];
        int Max=Min;
        int i_max=0;
        int i_min=0;

        for (int i =0;i<N;i++) {
            if(A[i]>Max) {
                Max = A[i];
                i_max=i;
            }
            else
                if(A[i]<Min) {
                    Min=A[i];
                    i_min=i;
                }
        }


        System.out.print("Введенная последовательность ");

        for(int i=0;i<N;i++){

            System.out.print(A[i]+", ");

        }




        if(A[i_max]!=A[i_min]){
            int temp=A[i_max];
            A[i_max]=A[i_min];
            A[i_min]=temp;
        }

        System.out.print("Измененная последовательность ");

        for(int i=0;i<N;i++){

            System.out.print(A[i]+", ");

        }










    }
}
