public class LogicalOperators {
    public static void main(String[] args) {
        int age=50;
        float salary=100_000;
//
//        if (age<25){
//            if (salary>50_000){
//                System.out.println("You have worked hard");
//            }
//        }
//        else{
//            System.out.println("Keep working consistently you are near to success");
//        }
        if(age>18 && salary>50_00_000){
            System.out.println("You have done a lot of hardwork");
        }
        else{
            System.out.println("Don't stop working");
        }

        int a=5,b=3,c=2,d=40;
        if((a<b) || (++c<d)){
            System.out.println("Inside if");
        }

    }
}
