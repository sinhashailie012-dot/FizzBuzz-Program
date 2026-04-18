
import java.util.Scanner;

public class MaxOfThreeNosTernary {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter the 1st number");
        num1=scanner.nextInt();
        System.out.println("Enter the 2nd number");
        num2=scanner.nextInt();
        System.out.println("Enter the 3rd number");
        num3=scanner.nextInt();

        int max=(num1>num2)?(num1>num3?num1:num3):((num2>num3)?num2:num3);
        System.out.println(max);


    }
}
