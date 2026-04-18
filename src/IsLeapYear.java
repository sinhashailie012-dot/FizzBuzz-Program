import java.util.Scanner;

public class IsLeapYear {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a year to check whether it's leap or not");
      int year;
      year=scanner.nextInt();
      if ((year%4==0 && year%100!=0)||(year%400==0)){
          System.out.println("It's a Leap year");
      }
      else
          System.out.println("IT's not a leap year");


  }
}
