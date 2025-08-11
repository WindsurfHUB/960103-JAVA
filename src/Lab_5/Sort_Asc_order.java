package Lab_5;

import java.util.Scanner;

public class Sort_Asc_order {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Enter positive number 3 times");
        System.out.print("Enter num 1 : ");
        num1 = inp.nextInt();
        System.out.print("Enter num 2 : ");
        num2 = inp.nextInt();
        System.out.print("Enter num 3 : ");
        num3 = inp.nextInt();

        for (int i =0; i < 2; i++) {
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }
        }
        System.out.println("Display number in Ascending order");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
