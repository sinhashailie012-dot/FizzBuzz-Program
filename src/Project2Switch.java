import java.util.Scanner;

public class Project2Switch {
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
           bill= switch(choice) {
                case 1->200;
                case 2 ->250;
                case 3->300;
                default->-1;
            };

            System.out.println("Add whipped cream for ₹30(yes=1 / no=0:");
            int choice2 = scanner.nextInt();
            if (choice2 == 1)
                bill = bill + 30;
            System.out.println("Add a flavor shot?(Vanilla for ₹20 or Hazelnut for ₹25(yes=1/no=0):");
            int choice3 = scanner.nextInt();
            if (choice3 == 1) {
                System.out.println("Which one??(Enter 1 for vanilla(₹20) & 2 for Hazelnut(₹25)): ");
                int choice4 = scanner.nextInt();
                bill=switch(choice4) {
                    case 1->{
                    bill  += 20;
                    yield bill;
                    }

                    case 2->{
                        bill += 25;
                        yield bill;
                    }
                    default->{
                        System.out.println("Invalid flavour choice");
                        yield bill;
                    }
                };
                System.out.println("Your total bill is ₹" + bill);
            }
        }
        else {
            System.out.println("Invalid coffee choice.");
        }
    }
}
