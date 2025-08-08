import java.util.Scanner;

public class Lab_1_2_TimeTravel {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the distance between the two cities (in km): ");
            double distance = scanner.nextDouble();
            System.out.print("Enter the average speed (in km/h): ");
            double speed = scanner.nextDouble();
            double time = distance / speed;
            System.out.printf("Estimated travel time: %.2f hours%n", time);
        }
}

