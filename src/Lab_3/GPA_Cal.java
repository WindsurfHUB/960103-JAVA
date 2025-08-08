package Lab_3;

import java.util.Scanner;

public class GPA_Cal {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double totalP = 0;
        double totalC = 0;

        while (true) {
            System.out.print("Enter grade 0-4 or Z to quit : ");

            if (inp.hasNextInt()) {
                int grade = inp.nextInt();
                if (grade < 0 || grade > 4) {
                    System.out.println("Grade must be between 0 and 4.");
                    continue;
                }

                System.out.print("Enter course credits : ");
                int credits = inp.nextInt();

                totalP += grade * credits;
                totalC += credits;
            } else {
                String input = inp.next();
                if (input.equalsIgnoreCase("z")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number 0-4 or Z to quit.");
                }
            }
        }

        if (totalC > 0) {
            double gpa = totalP / totalC;
            System.out.print("Your GPA is : " + gpa);
        } else {
            System.out.println("No grade entered");
        }
    }
}
