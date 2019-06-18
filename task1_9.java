package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_9 {



    public static void main(String[] args) {

        int N;
        int numb;
        int times_count=1;
        int times_max=0;


        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер последовательности");
        N=reader.nextInt();
        int [] A=new int[N];




        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();


        }

    numb=A[0];

        for (int i=0;i<N;i++){
            for(int k=i;k<N;k++){
                if(A[k]<A[i]){

                    int temp =A[k];
                    A[k]=A[i];
                    A[i]=temp;
                }
            }

        }


        for (int i=1;i<N;i++){

            if(A[i]==A[i-1]){

                times_count++;
            }
            else{
                if(times_count>times_max) {
                    times_max = times_count;
                    numb=A[i-1];
                }

                times_count=1;

            }
        }

        System.out.print(numb);



























    }
}
