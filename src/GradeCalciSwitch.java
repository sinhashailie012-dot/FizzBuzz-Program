import java.util.Scanner;

public class GradeCalciSwitch {
    static char calculator(int score) {
        if (score < 100 && score > 0) {
            return switch (score / 10) {
                case 9, 10 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'E';
            };
        } else {
            System.out.println("Invalid marks");
            return 'I';
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        char res = calculator(score);
        System.out.println(res);
    }


    }

