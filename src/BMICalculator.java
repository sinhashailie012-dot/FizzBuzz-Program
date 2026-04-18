import java.util.Scanner;

public class BMICalculator {
   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       double weight,height;
       System.out.println("Enter weight(in kg)");
       weight=scanner.nextDouble();
       System.out.println("Enter height");
       System.out.println("enter feet: ");
       double feet=scanner.nextDouble();
       System.out.println("Enter inches: ");
       double inch=scanner.nextDouble();
       height=(feet*0.3048)+(inch*0.0254);
       double bmi=weight/(height*height);
       System.out.println("Your BMI is "+ bmi);


   }
}
