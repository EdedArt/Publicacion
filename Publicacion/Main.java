import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Publication> publications = new ArrayList<>();

        int option;

        do {
            System.out.println("\n=================================");
            System.out.println("PUBLICATION MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Book");
            System.out.println("2. Disc");
            System.out.println("3. Video");
            System.out.println("4. Show all");
            System.out.println("5. Exit");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid option.");
                sc.next();
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    Book b = new Book();
                    b.obtainData(sc);
                    publications.add(b);
                    break;

                case 2:
                    Disc d = new Disc();
                    d.obtainData(sc);
                    publications.add(d);
                    break;

                case 3:
                    Video v = new Video();
                    v.obtainData(sc);
                    publications.add(v);
                    break;

                case 4:
                    if (publications.isEmpty()) {
                        System.out.println("No publications.");
                    } else {
                        for (Publication p : publications) {
                            p.show();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 5);

        sc.close();
    }
}