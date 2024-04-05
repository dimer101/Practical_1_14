/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_14;


public class MaxFinder implements Runnable {
    private String[] numbers;
    private int max;

    public MaxFinder(String[] numbers) {
        this.numbers = numbers;
        this.max = Integer.MIN_VALUE;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        for (String number : numbers) {
            int n = Integer.parseInt(number.trim());
            if (n > max) {
                max = n;
            }
        }
    }
}
