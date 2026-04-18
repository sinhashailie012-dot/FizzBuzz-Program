import java.time.DayOfWeek;

public class SwitchEnumEx {
    enum DayOfWeek {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
    static String getDayType(DayOfWeek day){
        return switch (day) {

            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Weekday";
        };
    }


    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        String res = getDayType(day);
        System.out.println(res);
    }

    }

