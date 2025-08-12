package Lab_5;

import java.util.Scanner;

public class Multiple_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String evenNum = "";
        String primeNum = "";
        int largest = 0;

        System.out.print("How many number you want to input : ");
        int amount = input.nextInt();

        for(int i = 0; i < amount; i++) {
            System.out.print("input number : ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                evenNum += number + " ";
            }

            int prime = 0;
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                primeNum += number + " ";
            }

            if (number > largest) {
                largest = number;
            }

        }
        System.out.println("Even number : " + evenNum);
        System.out.println("Prime number : " + primeNum);
        System.out.println("The largest number is : " + largest);
    }
}
