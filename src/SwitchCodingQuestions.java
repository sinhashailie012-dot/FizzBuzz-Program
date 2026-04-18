import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCodingQuestions {
    static String displayNumbers(int num) {
        return switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Invalid!!! Enter number between (0-9)";

        };
    }
       static String displayMonthNames(int n){
           return switch(n){
               case 1->"Jan";
               case 2-> "Feb";
               case 3-> "March";
               case 4->"April";
               case 5-> "May";
               case 6-> "June";
               case 7->"July";
               case 8-> "Aug";
               case 9-> "Sept";
               case 10->"Oct";
               case 11-> "Nov";
               case 12-> "Dec";
               default -> "Enter a valid month number";
           };
        }

        static int PriceOfDrink(String drink){
        return switch(drink){
            case "coffee"->50;
            case "tea"->30;
            case "juice"->70;
            case "water"->20;
            default -> {
                System.out.println("Not available here");
              yield  -1;
            }
        };
        }
        static String RomanNumerals(int number){
        return switch(number){
           case 1->"I" ;
           case 2->"II";
           case 3->"III";
           case 4->"IV";
            case 5->"V";
            case 6->"VI";
            case 7->"VII";
            case 8->"VIII";
            case 9->"IX";
            case 10->"X";
            default->"Invalid!! Enter  between (1-10)";

        };
        }


   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1
//       System.out.println("Enter a number between (1-9)");
//        int num=scanner.nextInt();
//        String res=SwitchCodingQuestions.displayNumbers(num);
//       System.out.println(res);

       //2
//       System.out.println("Enter month number(1-12)");
//       int n=scanner.nextInt();
//       String month=SwitchCodingQuestions.displayMonthNames(n);
//       System.out.println(month);

       //3
//       System.out.println("Enter the drink you want");
//       String drink=scanner.nextLine().toLowerCase();
//       int price=SwitchCodingQuestions.PriceOfDrink(drink);
//       System.out.println(price);

       //4
       System.out.println("Enter a number to be converted(1-10)");
       int number=scanner.nextInt();
       String romanNo=RomanNumerals(number);
       System.out.println(romanNo);

    }
}
