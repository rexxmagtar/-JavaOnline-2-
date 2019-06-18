package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        int N;
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер массива");
        N=reader.nextInt();
        int [] A=new int[N];

        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+ " число");
            A[i]=reader.nextInt();

        }

        int sum=0;
        int K;
        System.out.println("Введите число K ");
        K=reader.nextInt();
        for (var token:A ){
            if(token%K==0)
                sum+=token;

        }

        System.out.print("Сумма равна "+ sum);



    }
}
