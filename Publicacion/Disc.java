import java.util.Scanner;

public class Disc extends Publication {
    private double durationMinutes;

    public Disc() {
        super();
    }

    public void obtainData(Scanner sc) {
        super.obtainData(sc);

        System.out.print("Enter duration in minutes: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Enter a number:");
            sc.next();
        }
        durationMinutes = sc.nextDouble();
        sc.nextLine();
    }

    public void show() {
        System.out.println("\n--- DISC ---");
        super.show();
        System.out.println("Duration: " + durationMinutes + " minutes");
    }
}