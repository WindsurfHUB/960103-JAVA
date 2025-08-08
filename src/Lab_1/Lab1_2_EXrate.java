import java.util.Scanner;

public class Lab1_2_EXrate {
    public static void main(String[] args) {
        System.out.print("Enter the amount in THB : ");
        Scanner inp = new Scanner(System.in);
        double inrate = inp.nextDouble();
        double JPY_exrate = 4.47 * inrate;
        System.out.printf("Exchange rate from THB to JPY : %.2f%n", JPY_exrate);
    }
}