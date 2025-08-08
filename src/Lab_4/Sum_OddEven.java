package Lab_4;

import java.util.Scanner;

public class Sum_OddEven {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        //Receive input from user
        System.out.print("Enter an integer(z to stop) : ");
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int intinp = input.nextInt();
                if ((intinp % 2) == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                String strinp = input.next();
                if (strinp.equalsIgnoreCase("z")){
                    break;
                } else {
                    System.out.print("Invalid input. Enter integer or z to quit program");
                }
            }
            System.out.print("Enter an integer(z to stop) : ");
        }
        //Result
        System.out.println("This is the sum of even : " + even);
        System.out.println("This is the sum of odd : " + odd);
    }
}
