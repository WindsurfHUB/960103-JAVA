import java.util.Scanner;

public class Lab_1_2_F {
    public static void main(String[] args) {
        System.out.print("Enter the C : ");
        Scanner input = new Scanner(System.in);
        double C = input.nextDouble();
        double F = (9.0 / 5.0) * C + 32;
        System.out.println("The -5 celsius in fahrenheit is : " + F);
    }
}