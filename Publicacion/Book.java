import java.util.Scanner;

public class Book extends Publication {
    private int numberPages;
    private int yearPublication;

    public Book() {
        super();
    }

    public void obtainData(Scanner sc) {
        super.obtainData(sc);

        System.out.print("Enter number of pages: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter an integer:");
            sc.next();
        }
        numberPages = sc.nextInt();

        System.out.print("Enter publication year: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter an integer:");
            sc.next();
        }
        yearPublication = sc.nextInt();
        sc.nextLine();
    }

    public void show() {
        System.out.println("\n--- BOOK ---");
        super.show();
        System.out.println("Pages: " + numberPages);
        System.out.println("Year: " + yearPublication);
    }
}