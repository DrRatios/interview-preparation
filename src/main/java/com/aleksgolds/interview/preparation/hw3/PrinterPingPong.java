package com.aleksgolds.interview.preparation.hw3;

public class PrinterPingPong {
    private boolean flag = false;

    public synchronized void printPing(){
        while(flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        flag = true;
        notify();
    }
    public synchronized void printPong(){
        while(!flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        flag = false;
        notify();
    }

}
