package Lab_2;

import java.util.Scanner;

public class CAM_Shop_Discount {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your member ship type (Gold/Silver) : " );
        String member = inp.next().toLowerCase();

        System.out.print("Enter your total price : " );
        double price = inp.nextInt();

        double dis = 0.0;

        if (member.equals ("silver")) {
            if (price <= 1000) {
                dis = 0.02;
            } else if (price <= 10000) {
                dis = 0.03;
            } else {
                dis = 0.05;
            }
        } else if (member.equals ("gold")) {
            if (price <= 1000) {
                dis = 0.05;
            } else if (price <= 10000) {
                dis = 0.08;
            } else {
                dis = 0.1;
            }
        }
        else {
            System.out.print("You are NOT M E M B E R S H I P ! !");
        }
        double discal = price * dis;
        double disprice = price - discal;
        System.out.print("This is the price after discount : " + disprice);
    }
}
