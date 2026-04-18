import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        boolean isIndian;
        System.out.println("Are uh Indian(true/false)");
        isIndian=scanner.nextBoolean();
        System.out.println("Enter your age");
        age=scanner.nextInt();
        if(age>=18 && isIndian){
            System.out.println("Eligible for voting");
        }
        else
            System.out.println("Not eligible");

    }
}
