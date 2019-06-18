package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_3 {

    public static void main(String[] args) {

        int N;
        int count_zero=0;
        int count_pos=0;
        int count_neg=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер массива");
        N=reader.nextInt();
        int [] A=new int[N];


        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();
            if(A[i]>0)
                count_pos++;
            else
                if(A[i]<0)
                    count_neg++;
                else
                    count_zero++;

        }


        System.out.print("введенная последовательность ");

        for(int i=0;i<N;i++){

            System.out.print(A[i]+", ");

        }

System.out.print("Положительных :"+count_pos+" Отрицательных " +count_neg+" Нулевых "+count_zero);









    }
}
