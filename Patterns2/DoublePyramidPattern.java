package Patterns2;

import java.util.Scanner;

public class DoublePyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= rows; i++) {
            // Print spaces for the left pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the left pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            // Print spaces between the two pyramids
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Print stars for the right pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

