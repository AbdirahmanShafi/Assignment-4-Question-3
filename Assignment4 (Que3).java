/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author abdir
 */
public class Assignment4Q3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 5: ");
        int num = scanner.nextInt();

        // Using if-else statement
        if (num == 1) {
            System.out.println("You entered One.");
        } else if (num == 2) {
            System.out.println("You entered Two.");
        } else if (num == 3) {
            System.out.println("You entered Three.");
        } else if (num == 4) {
            System.out.println("You entered Four.");
        } else if (num == 5) {
            System.out.println("You entered Five.");
        } else {
            System.out.println("Invalid input.");
        }

        // Using switch statementS
        switch (num) {
            case 1:
                System.out.println("One.");
                break;
            case 2:
                System.out.println("Two.");
                break;
            case 3:
                System.out.println("Three.");
                break;
            case 4:
                System.out.println("Four.");
                break;
            case 5:
                System.out.println("Five.");
                break;
            default:
                System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
