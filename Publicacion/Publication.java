import java.util.Scanner;

public class Publication {
    protected String title;
    protected double price;

    public Publication() {
        this.title = "";
        this.price = 0.0;
    }

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void obtainData(Scanner sc) {
        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Enter a valid number:");
            sc.next();
        }
        price = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Price: $" + price;
    }
}