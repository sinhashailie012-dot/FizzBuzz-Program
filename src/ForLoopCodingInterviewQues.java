import java.util.Scanner;

public class ForLoopCodingInterviewQues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
//       System.out.println("Enter the last number");
//       int n=scanner.nextInt();
//       for(int i=1;i<=n;i++){
//           System.out.println(i);
//       }

        //2
//       System.out.println("Enter a number for which the factorial is to be calculated");
//       int num=scanner.nextInt();
//       if (num==0)
//           System.out.println(1);
//       else {
//           int fact = 1;
//           for (int i = 1; i <= num; i++) {
//               fact *= i;
//           }
//
//           System.out.println(fact);
//       }
        //3
//       System.out.println("Enter a number");
//       int num=scanner.nextInt();
//       for(int i=1;i<=10;i++){
//
//           System.out.println(num +"x"+i+"="+(num*i));
//       }

        //4
//       System.out.println("Enter a number");
//       int n=scanner.nextInt();
//       for(int i=0;i<=n;i+=2){
//           System.out.println(i);
//       }

        //5
//        System.out.println("Enter a number to check whether it's prime or not");
//        int num = scanner.nextInt();
//
//        if (num < 2)
//            System.out.println("The number " + num + " is not a prime number");
//        else {
//            int count = 0;
//            for (int i = 1; i <= num; i++) {
//                if (num % i == 0) {
//                    count += 1;
//                }
//            }
//            if (count == 2)
//                System.out.println("Prime");
//            else
//                System.out.println("Not prime");
//        }
//
         //Palindrome
//        int n=57175;
//        int original=n;
//        int rev=0;
//        while(n>0){
//            int digit=n%10;
//            rev=rev*10+digit;
//            n=n/10;
//        }
//        if (original==rev)
//        System.out.println("Palindrome");
//        else System.out.println("Not");

//7
//        System.out.println("Enter a number whose sum is to be calculated");
//        int num=scanner.nextInt();
//        int sum=0;
//        while(num>0){
//            sum+=num%10;
//            num=num/10;
//        }
//        System.out.println("sum is " +sum);

        //8
//        System.out.println("Enter a number till when reverse is to be found");
//       int n=scanner.nextInt();
//        for(int i=n;i>=1;i--){
//            System.out.println(i);
//        }

        //11
//        System.out.println("Enter a number to count its digits");
//        int n=scanner.nextInt();
//        int original=n;
//        int count=0;
//        while(n>0){
//            count+=1;
//            n/=10;
//        }
//        System.out.println(original+"is a "+count+"-digit number");

        //12
//        System.out.println("Enter a number to be reversed");
//        int number=scanner.nextInt();
//        int rev=0;
//        while(number>0){
//            int lastDigit=number%10;
//            rev=rev*10+lastDigit;
//            number/=10;
//        }
//        System.out.println("The reversed number is:"+rev);

        //13
        System.out.println("Enter the number for which the power is to be calculated");
        long num=scanner.nextInt();
        System.out.println("Enter the power");
        int pow=scanner.nextInt();
        long powerOfNo=1;
        for(int i=1;i<=pow;i++){
            powerOfNo=powerOfNo*num;
        }
        System.out.println(powerOfNo);
    }}




