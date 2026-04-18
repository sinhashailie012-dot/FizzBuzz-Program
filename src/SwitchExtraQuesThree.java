import java.util.Scanner;

public class SwitchExtraQuesThree {
    static String TrafficLightAction(String colorOfLight){
        return switch(colorOfLight){
            case "red"->"Stop";
            case "yellow"->"Wait";
            case "green"->"Go";
            default->"Invalid traffic light colour";
        };
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter color of traffic light");
        String color=scanner.nextLine().toLowerCase();
        String act=TrafficLightAction(color);
        System.out.println("The color of the light means \""+act+"\"");
    }
}
