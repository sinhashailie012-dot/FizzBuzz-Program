import java.util.Scanner;

public class ConcertEntry {
   public static void main(String[] args) {
boolean hasTicket,VIPinvited;
int age;
Scanner scanner=new Scanner(System.in);
       System.out.println("Enter ur age: ");
       age=scanner.nextInt();
       System.out.println("Dou you have ticket?(true/false)");
       hasTicket=scanner.nextBoolean();
       System.out.println("Are you invited by VIP??(true/false)");
       VIPinvited=scanner.nextBoolean();

       if(age>=18 && (hasTicket|| VIPinvited))
           System.out.println("Entry accessed");

       else
           System.out.println("Entry denied");

   }
}
