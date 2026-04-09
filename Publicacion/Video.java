import java.util.Scanner;

public class Video extends Publication {

    public enum Language {
        SPANISH, ENGLISH, PORTUGUESE
    }

    private Language language;
    private int durationHours;

    public Video() {
        super();
    }

    public void obtainData(Scanner sc) {
        super.obtainData(sc);

        int option;
        do {
            System.out.println("Select language:");
            System.out.println("1. Spanish");
            System.out.println("2. English");
            System.out.println("3. Portuguese");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
            }

            option = sc.nextInt();

        } while (option < 1 || option > 3);

        language = Language.values()[option - 1];

        System.out.print("Enter duration in hours: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.");
            sc.next();
        }
        durationHours = sc.nextInt();
        sc.nextLine();
    }

    public void show() {
        System.out.println("\n--- VIDEO ---");
        super.show();
        System.out.println("Language: " + language);
        System.out.println("Duration: " + durationHours + " hours");
    }
}