// Lab_03_1
//  Жовніренко Нікіта
// Лабораторна робота No 3.1
// Розгалуження, задане формулою: функція однієї змінної.
// Варіант 5



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Уведіть значення X: ");
        double x = sc.nextDouble();


        double y = 0;

        if(x < 1) {
            y = (1 / Math.abs(x + 2) + 1) - 7 * Math.pow(x, 2) + x - 8;
        }

        else if(x >= 1 && x <= 4){
            y = (1 / Math.abs(x + 2) + 1) - (Math.cos((x + 4) / Math.sqrt(11)) / Math.sin((x + 4) / Math.sqrt(11))) + 3;
        }


        else {
            y = (1 / Math.abs(x + 2) + 1) - Math.sqrt(1 + Math.pow(Math.cos(x), 3));
        }


        System.out.println("1) Значення Y при даному значенні x: " + y);

        if (x < 1)
        {
            y = (1 / Math.abs(x + 2) + 1) - 7 * Math.pow(x, 2) + x - 8;
        }

        else
        {
            if (x > 4)
            {
                y = (1 / Math.abs(x + 2) + 1) - Math.sqrt(1 + Math.pow(Math.cos(x), 3));
            }
            else
                y = (1 / Math.abs(x + 2) + 1) - (Math.cos((x + 4) / Math.sqrt(11)) / Math.sin((x + 4) / Math.sqrt(11))) + 3;
        }
        System.out.println("2) Значення Y при даному значенні x: " + y);


    }
}
