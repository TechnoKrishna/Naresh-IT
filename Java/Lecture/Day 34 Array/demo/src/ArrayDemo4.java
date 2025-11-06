import java.util.Scanner;

class Player {
    private int id;
    private String name;
    private double price;

    public Player(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Player object: ");
        int size = Integer.parseInt(sc.nextLine());

        Player players[] = new Player[size];

        // Initializing array using for loop
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Player Id: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Player Base Price: ");
            double price = Double.parseDouble(sc.nextLine());

            players[i] = new Player(id, name, price);
        }

        System.out.println("\nPrinting Player Objects:");
        for (Player player : players) {
            System.out.println(player);
        }

        sc.close();
    }
}
