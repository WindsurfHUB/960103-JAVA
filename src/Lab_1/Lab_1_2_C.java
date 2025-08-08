import java.util.Scanner;

public class Lab_1_2_C {
    public static void main(String[] args){
        System.out.print("Enter the F : ");
        Scanner input1 = new Scanner(System.in);
        double f = input1.nextDouble();
        double c = (f -32) * 5.0 / 9.0;
        System.out.println("The -5 fahrenheit in celsius is : " + c);
    }
}