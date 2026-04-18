

import java.util.Scanner;

public class SwitchExtraQuesFive {

    static int Calculator(int a,int b,char op){
        return switch(op){
            case '+'->a+b;
            case '-'->a-b;
            case '*'->a*b;
            case '/'->a/b;
            case '%'->a%b;
            default->-1;
        };
    }
    public static void main() {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        a=scanner.nextInt();
        System.out.println("Enter 2nd no");
        b=scanner.nextInt();

        System.out.println("Enter an operator(+,-,*,/,%)");
        char op=scanner.next().charAt(0);
        int res= Calculator(a,b,op);
        System.out.println(res);
    }
}
