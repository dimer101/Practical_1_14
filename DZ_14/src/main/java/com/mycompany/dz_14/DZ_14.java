/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dz_14;

import java.util.Scanner;


public class DZ_14 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.14, Student Dmitry Poluektov, RIBO-01-22, Variant 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовую последовательность через запятую:");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");

        MaxFinder maxFinder = new MaxFinder(numbers);
        MinFinder minFinder = new MinFinder(numbers);

        Thread maxThread = new Thread(maxFinder);
        Thread minThread = new Thread(minFinder);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Максимальное значение: " + maxFinder.getMax());
        System.out.println("Минимальное значение: " + minFinder.getMin());

        scanner.close();

    }
}
