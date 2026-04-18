import java.util.Scanner;

public class AreaCircumferenceOfCircle {
    static void main(String[] args) {
        final double PI=3.14159;
        float radius;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius ");
        radius=scan.nextFloat();
        double area=PI*radius*radius;
        double circumference=2*PI*radius;
        System.out.println("area is "+ area);
        System.out.println("Circumference is "+ circumference);


    }
}
