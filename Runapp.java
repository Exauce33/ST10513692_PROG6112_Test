import java.util.Scanner;
public class Runapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a console type: ");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. Switch");
        System.out.println("Enter your choice");
        int choice = Integer.parseInt(input.nextLine());
        String consoleType = "";

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;


        }

        System.out.println("Enter Store name: ");
        String Store = input.nextLine();

        System.out.println("Enter the total sales of PS5 consoles for Number 1 Electronics Store: ");
        int totalSales = Integer.parseInt(input.nextLine());
        ConsolSales sales = new ConsolSales(consoleType, Store, totalSales);
        
    }

    private record ConsolSales(String consoleType, String store, int totalSales) {
    }
}