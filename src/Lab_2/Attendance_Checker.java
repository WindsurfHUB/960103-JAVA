package Lab_2;

import java.util.Scanner;
public class Attendance_Checker {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Enter total num of class
        System.out.print("Enter total amount of class : ");
        int totalClass = inp.nextInt();

        //Enter num of times late
        System.out.print("Enter amount of times late : ");
        int totalLate = inp.nextInt();

        //Enter num if times absent
        System.out.print("Enter amount of times absent : ");
        int totalAbs = inp.nextInt();

        //Check
        double abs = totalAbs + (totalLate * 0.5);
        double res = 100 * (totalClass  - abs) / totalClass;

        if (res >= 80.0) {
            System.out.print("Student can take exam" );
        } else {System.out.print("Student can not take exam");
        }
    }
}
