package com.operation;

public class ThreadOperantion implements Runnable {
    private int number,number1;
    private String procces;
    public ThreadOperantion(int number,int number1,String procces){//yapıcı class olusturdum.
        this.number=number;
        this.number1=number1;
        this.procces=procces;
    }
    public void run() {
        Operations operations=new OperationsImpl();
        switch (procces){
            case "+":
                System.out.println(number+" + "+number1+" = " +(number+number1));
                System.out.println("Toplama :"+operations.sumNumber(number,number1));//OperationImpl işlemi
                break;
            case "-":
                System.out.println(number+" - "+number1+" = " +(number-number1));
                System.out.println("Cıkartma :"+operations.subNumber(number,number1));//OperationImpl işlemi
                break;
            case "*":
                System.out.println(number+" * "+number1+" = " +(number*number1));
                System.out.println("Carpma :"+operations.multiplicationNumber(number,number1));//OperationImpl işlemi
                break;
            case "/":
                System.out.println(number+" / "+number1+" = " +(number/number1));
                System.out.println("Bölme :"+operations.divisionNumber(number,number1));//OperationImpl işlemi
                break;
                default:
                    System.out.println("İstediğiniz işlem gerçekleştirilemez.");
        }

    }
}
