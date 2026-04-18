import java.util.Scanner;

public class FizzBuzzProgram {
   public static void main(String[] args) {
        int num;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter a number for the FizzBuzz Program");
       num=scanner.nextInt();
       for(int i=1;i<=num;i++){
           if(i%3==0 && i%5==0 )
               System.out.println("--FizzzBuzz!!--");
           else if(i%5==0)
               System.out.println("--Buzzz!!--");
           else if(i%3==0 )
               System.out.println("--Fizzz!!--");
           else
               System.out.println(i);

       }
    }
}
