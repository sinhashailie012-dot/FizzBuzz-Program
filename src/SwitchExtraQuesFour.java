import java.util.Scanner;

public class SwitchExtraQuesFour {
    static String CheckEvenOdd(int num){
        return switch(num%2){
            case 0->"Even";
            default->"Odd";
        };
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
String res=CheckEvenOdd(num);
        System.out.println(res);
    }
}
