package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class task1_8 {



    public static void main(String[] args) {

        int N;
        int min;
        int min_count=1;
int sum=0;

        Scanner reader=new Scanner(System.in);
        System.out.println("Введите размер последовательности");
        N=reader.nextInt();
        int [] A=new int[N];


        System.out.println("Введенный массив");

        for(int i=0;i<N;i++){
            System.out.println("Введите " + (i+1)+"-е"+ " число");
            A[i]=reader.nextInt();




        }


for(int i=0;i<N;i++){
    for(int k=i;k<N;k++){
        if(A[i]>A[k]){
            int temp=A[i];
            A[i]=A[k];
            A[k]=temp;
        }
    }
}
min=A[0];
for(int i=1;i<N;i++){
    if(A[i]==min)
        min_count++;
    else break;;

}

int [] seq=new int[N-min_count];
int k=0;
for (int i=min_count;i<N;i++){
    seq[k]=A[i];
    k++;
}

for (int i=0;i<N-min_count;i++){
    System.out.print(seq[i]+", ");
}






















    }
}
