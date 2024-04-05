/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_14;


public class MinFinder implements Runnable {
    private String[] numbers;
    private int min;

    public MinFinder(String[] numbers) {
        this.numbers = numbers;
        this.min = Integer.MAX_VALUE;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {
        for (String number : numbers) {
            int n = Integer.parseInt(number.trim());
            if (n < min) {
                min = n;
            }
        }
    }
}
