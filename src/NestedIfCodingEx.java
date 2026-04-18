import java.util.Scanner;

public class NestedIfCodingEx {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
//       System.out.println("Enter ur age");
//       int age=scanner.nextInt();
//       if (age>=18){
//       System.out.println("Are uh a citizen of India(true/false)");
//       boolean hasCitizenship=scanner.nextBoolean();
//
//           if (hasCitizenship){
//               System.out.println("You can vote");
//           }
//           else{
//               System.out.println("get yourself an Indian citizenship first");
//           }
//
//       }
//       else{
//           System.out.println("you are not eligible to vote");
//       }



       //2

       System.out.println("Enter a number to check");
       int num=scanner.nextInt();
       if(num>=0){
           if (num%2==0){
               System.out.println("Even");
           }
           else
               System.out.println("Odd");
       }
       else{
           System.out.println("Enter a +ve num");
       }

   }
}
