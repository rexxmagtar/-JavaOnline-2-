package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_6 {

    public  static boolean check_if_simple(int number){

        for (int i=2;i<number;i++){
            if(number%i==0)
                return false;
        }

        return  true;
    }

    public static void main(String[] args) {

        int N;
int sum=0;

        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер последовательности");
        N=reader.nextInt();
        int [] A=new int[N];


        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();
            if(check_if_simple(i+1)){
                sum+=A[i];
            }



        }

System.out.print("Сумма :" +sum);




















    }
}
