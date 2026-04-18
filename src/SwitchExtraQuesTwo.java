import java.util.Scanner;

public class SwitchExtraQuesTwo{
        static int DaysInMonth(int monthNo) {
            return switch (monthNo) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> {
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Enter the year");
                    int year=scanner.nextInt();
                    if((year%4==0 && year%100!=0 )|| year%400==0 ) {
                        System.out.println("It's a leap year");
                        yield 29;
                    }
                    else
                        yield 28;
                }
                case 4, 6, 9, 11 -> 30;
                default->-1;
            };
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter month number(1-12)");
            int monthNo=scanner.nextInt();
            int res=DaysInMonth(monthNo);
            if (monthNo>0 && monthNo<=12)
                System.out.println("The month no." +monthNo+" has "+res+" days ");
            else
                System.out.println("Invalid month number");
        }
    }



