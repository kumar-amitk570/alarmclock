import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = 6;  // Default hours
        int minutes = 0; // Default minutes

        System.out.println("Running in automated mode with default alarm time: " + hours + ":" + minutes);
        System.out.println("If manual input is required, please ensure the program is run interactively.");
    }
}
