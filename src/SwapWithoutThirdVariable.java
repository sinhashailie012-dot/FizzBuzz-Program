import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=scanner.nextInt();
        System.out.println("Enter b: ");
        b=scanner.nextInt();
        System.out.println("Before swapping");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
//        a=a^b;
//        b=a^b;
//        a=a^b;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
