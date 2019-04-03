package com.operation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExampleTest {
    public static void main(String[] args) {
        int number=3;
        int number1=2;
        System.out.println("Sayi1 :"+number);
        System.out.println("Sayi2 :"+number1);
        System.out.println("İşlemler");
        ThreadOperantion threadOperantion=new ThreadOperantion(number,number1,"+");
        ThreadOperantion threadOperantion1=new ThreadOperantion(number,number1,"-");
        ThreadOperantion threadOperantion2=new ThreadOperantion(number,number1,"*");
        ThreadOperantion threadOperantion3=new ThreadOperantion(number,number1,"/");

        ExecutorService executorService= Executors.newFixedThreadPool(4);

        Thread threadToplama=new Thread(threadOperantion);
        Thread threadCikartma=new Thread(threadOperantion1);
        Thread threadCarpma=new Thread(threadOperantion2);
        Thread threadBolme=new Thread(threadOperantion3);

        executorService.submit(threadToplama);
        executorService.submit(threadCikartma);
        executorService.submit(threadCarpma);
        executorService.submit(threadBolme);

        executorService.shutdown();
    }
}
