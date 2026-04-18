import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Welcome to Coffee Cafe!" + "\u2615");
        System.out.println("***********************");
        System.out.println("\n");
        System.out.println("Choose your coffee");
        System.out.println("1. Espresso - ₹200");
        System.out.println("2. Cappuccino - ₹250");
        System.out.println("3. Latte - ₹300");
        System.out.println("Enter your choice:");
        float bill = 0;

        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 3) {
            if (choice == 1) {
                bill = 200;
            } else if (choice == 2) {
                bill = 250;
            } else if (choice == 3) {
                bill = 300;
            }

            System.out.println("Add whipped cream for ₹30(yes=1 / no=0:");
            int choice2 = scanner.nextInt();
            if (choice2 == 1)
                bill = bill + 30;
            System.out.println("Add a flavor shot?(Vanilla for ₹20 or Hazelnut for ₹25(yes=1/no=0):");
            int choice3 = scanner.nextInt();
            if (choice3 == 1) {
                System.out.println("Which one??(Enter 1 for vanilla(₹20) & 2 for Hazelnut(₹25)): ");
                int choice4 = scanner.nextInt();
                if (choice4 == 1)
                    bill = bill + 20;
                else if (choice4 == 2)
                    bill = bill + 25;
                System.out.println("Your total bill is ₹" + bill);
            }
        }
            else {
                System.out.println("Invalid coffee choice.");
            }
        }
    }
