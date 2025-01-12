import java.util.Calendar;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.println("Enter alarm time (hours): ");
        int hours = scanner.nextInt();

        System.out.println("Enter alarm time (minutes): ");
        int minutes = scanner.nextInt();

        System.out.println("Alarm set for " + hours + ":" + minutes);
        scanner.close();

        // Add logic to compare with the current time and ring the alarm.
    }
}
