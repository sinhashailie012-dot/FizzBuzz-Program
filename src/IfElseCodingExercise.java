import java.util.Scanner;

public class IfElseCodingExercise {
   public static void main(String[] args) {
//        int num;
        Scanner scanner=new Scanner(System.in);
//       System.out.println("Enter a number");
//       num=scanner.nextInt();
//       if (num>=0)
//           System.out.println("Positive!!!");
//       else
//           System.out.println("Negative!!!");
//       System.out.println("Outside if-else");

       //2
//       int a,b;
//       System.out.println("Enter the first number");
//       a=scanner.nextInt();
//       System.out.println("Enter second number");
//       b=scanner.nextInt();
//       if (a>b)
//           System.out.println(a+" is greater than "+b);
//       else
//           System.out.println(b+" is greater than "+a);


       //3

       int choice;
       System.out.println("enter two numbers to be computed");
       int p=scanner.nextInt();
       int q =scanner.nextInt();

       System.out.println("Enter your choice(1 for addition/ any other for subtraction");
       choice=scanner.nextInt();
       if (choice==1)
           System.out.println("Sum is "+ (p+q));
       else
           System.out.println("Sum is "+ (p-q));



   }
}
