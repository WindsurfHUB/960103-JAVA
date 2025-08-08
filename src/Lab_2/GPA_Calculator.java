package Lab_2;

import java.util.Scanner;
public class GPA_Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //inp credit & grade
        System.out.print("Enter English credits : ");
        int engCredits = inp.nextInt();
        System.out.print("Enter Math credits : ");
        int mathCredits = inp.nextInt();
        System.out.print("Enter English grade A-F : ");
        char engGrade = inp.next().toUpperCase().charAt(0);
        System.out.print("Enter Math grade A-F : ");
        char mathGrade = inp.next().toUpperCase().charAt(0);

        //GPA

        int engP = 0;
        int mathP = 0;

        switch (engGrade) {
            case 'A' : engP = 4; break;
            case 'B' : engP = 3; break;
            case 'C' : engP = 2; break;
            case 'D' : engP = 1; break;
            case 'F' : engP = 0; break;
        }
        switch (mathGrade) {
            case 'A' : mathP = 4; break;
            case 'B' : mathP = 3; break;
            case 'C' : mathP = 2; break;
            case 'D' : mathP = 1; break;
            case 'F' : mathP = 0; break;
        }

        int totalC = engCredits + mathCredits;
        double totalP = (engP * engCredits) + (mathP * mathCredits);
        double GPA = totalP / totalC;

        System.out.print("This is you GPA : " + GPA);
    }
}
