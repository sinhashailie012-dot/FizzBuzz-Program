import java.util.Scanner;

public class EvenOddwidBitwiseOp {
   public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
       System.out.println("Enter a number");
        num=scanner.nextInt();
        if((num & 1)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
