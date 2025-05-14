package com.aleksgolds.interview.preparation.hw3;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp1 {
    /**
     * 1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
     *
     * @param args
     */

    public static void main(String[] args) {
        PrinterPingPong printerPingPong = new PrinterPingPong();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                printerPingPong.printPing();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                printerPingPong.printPong();
            }
        }).start();


    }


}


