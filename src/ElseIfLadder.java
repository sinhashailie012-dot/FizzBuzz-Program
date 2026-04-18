import java.util.Scanner;

public class ElseIfLadder {
   public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
//       System.out.println("Enter ur marks");
//       float marks=scanner.nextFloat();
//       if (marks>100 || marks<0)
//           System.out.println("Invalid marks");
//       else {
//           if (marks >= 90)
//               System.out.println("A");
//           else if (marks >= 80)
//               System.out.println("B");
//           else if (marks >= 70)
//               System.out.println("C");
//           else if (marks >= 60)
//               System.out.println("D");
//           else
//               System.out.println("E");
//       }
       //2

//       System.out.println("Enter a number");
//       int number=scanner.nextInt();
//       if (number>0)
//           System.out.println("Positive!!");
//       else if(number<0)
//           System.out.println("negative");
//       else
//           System.out.println("zero");


       //3

       System.out.println("Enter operator to perform(+,-,*,/,%)");
       char op=scanner.next().charAt(0);
       if (op=='+'|| op=='-'|| op=='*'|| op=='/'|| op=='%') {
       System.out.println("Enter two nos");
       int a,b;
       a=scanner.nextInt();
       b=scanner.nextInt();

    if (op == '+')
        System.out.println("Sum of a+b=" + (a + b));
    else if (op == '-')
        System.out.println("a-b=" + (a - b));
    else if (op == '*')
        System.out.println("a*b=" + (a * b));
    else if (op == '/') {
        if (b != 0) {
            float div = a / b;
            System.out.println("a/b=" + div);
        } else
            System.out.println("Division can't be performed since denominator is zero");
    } else if (op == '%')
        System.out.println("a%b=" + (a % b));

}

else
    System.out.println("Invalid operator!!!");

       scanner.close();

   }
}
