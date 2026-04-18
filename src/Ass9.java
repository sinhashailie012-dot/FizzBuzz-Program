import java.util.Scanner;

public class Ass9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       int a,b,c;
//       System.out.println("Enter three nos");
//       a=scanner.nextInt();
//       b=scanner.nextInt();
//       c=scanner.nextInt();
//       if (a>=b && a>=c){
//           System.out.println("a is the greatest "+ a);
//       }
//       else if(b>=a && b>=c){
//           System.out.println("b is the greatest "+b);
//       }
//       else{
//           System.out.println("c is the greatest "+c);
//       }

        //2
//       System.out.println("Enter a character");
//       char ch=scanner.next().charAt(0);
//
//       if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||
//               ch=='u'|| ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
//           System.out.println("It's a vowel");
//       }
//           else{
//               System.out.println("Consonant");
//           }

        //3
//       System.out.println("Enter an year");
//       int year=scanner.nextInt();
//       if (year%4==0) {
//           if (year % 100 == 0) {
//               if (year % 400 == 0) {
//                   System.out.println("Leap year");
//               } else {
//                   System.out.println("not a leap year");
//               }
//           }
//           else {
//               System.out.println("leap year");
//           }
//       }
//               else{
//                   System.out.println("Not a leap year");
//               }
//
//


        //5
//        System.out.println("Enter three numbers");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        if (a > b) {
//            if (b > c) {
//                System.out.println(b + " is the second largest");
//            } else {
//                if (a > c) {
//                    System.out.println(c + " is the second largest");
//                } else {
//                    System.out.println(a + " is the second largest");
//                }
//            }
//        } else {
//            if (a > c) {
//                System.out.println(a + " is the second largest number");
//            } else {
//                if (b > c) {
//                    System.out.println(c + " is the second largest number");
//                } else {
//                    System.out.println(b + " is the second largest number");
//                }
//            }
//        }


        //6
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num%5==0 && num%13==0){
            System.out.println("The num is div by both 5 and 13");
        }
        else{
            System.out.println("Not div ");
        }

scanner.close();
    }
}

