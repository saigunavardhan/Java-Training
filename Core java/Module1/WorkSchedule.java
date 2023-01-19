package Module1;

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 1;  
        boolean holiday = false;

        if (holiday) {
            System.out.println("woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("it's the weekend, no work!");
        } else {
            System.out.println("Wake up at 5:00 :(");
        }

    }
}