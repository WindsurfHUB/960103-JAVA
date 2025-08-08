import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.1416 *radius * radius;
        double circumference = 2*3.1416 * radius;
        System.out.println("The area of this circle is " + area);
        System.out.println("The circumference is " + circumference);
        //The area of this circle is 78.54
        //The circumference is 31.416
        //The area of this circle is 452.3904
        //The circumference is 75.3984
        //The area of this circle is 2.0501380374773758E11
        //The circumference is 1605081.1391999999
    }
}