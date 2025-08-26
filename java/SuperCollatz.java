/**
 * Written by HAV0X_ on 8/21/2025
 * Updated 8/26/2025
 */

import java.util.Scanner;

public class SuperCollatz {
    public static void main(String[] args) {
        int steps = 0;
        int peak = 0;
        System.out.println("Input a positive integer to run the collatz conjecture on: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Starting number: " + number);
        long startTime = System.nanoTime();
        while (number != 1) {
            if (number > peak) peak = number;
            if ((number & 1) == 0) { //bitwise modulo
                number >>= 1; //bitwise division by 2
                steps++;
            } else {
                number = (3 * number) + 1;
                number >>= 1;
                steps += 2;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Peak number: " + peak + " Steps: " + steps + " Calculation time: " + (endTime - startTime) + " nanoseconds.");
    }
}
