import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        System.out.println("Raw form: " + time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        if (hour == 0) {
            hour = 12;
        } else if (hour < 10) {
            hour = hour + 0;
        } else if (hour > 12) {
            hour = hour - 12;
        }

        String nicerForm = hour + ":" + minute + ":" + second + (time.getHour() >= 12 ? " PM" : " AM");

        System.out.println("Nicer form: " + nicerForm);
    }
}