package Lab_5;

import java.util.Scanner;

public class Multiple_int {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even = 0;
        int prime = 0;
        int largest = 0;

        System.out.print("How many number you want to input : ");
        int amount = input.nextInt();

        for(int i = 0; i < amount; i++) {
            System.out.print("input number : ");
            int number = input.nextInt();

            if ((number % 2 ) == 0) {
                even++;
            }

            if (number <= 1) {
                continue;
            } else if (number % number == 0) {
                prime++;
            }

            if (number > largest) {
                largest = number;
            }

        }
        System.out.println("Even number : " + even);
        System.out.println("Prime number : " + prime);
        System.out.println("The largest number is : " + largest);
    }
}
