import java.util.Scanner;
public class SwitchExtraQuesOne {
    static char gradeSystem(int score) {
        if (score > 0 && score < 100) {
            return switch (score / 10) {
                case 9, 10 ->{
                    System.out.println("Your marks are "+ score);
                   yield 'A';
                }
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
        } else {
            System.out.println("Invalid score");
            return 'I';

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        char res = gradeSystem(score);
        System.out.println("You got "+res);
    }
}

