import java.util.Scanner;

public class Zadacha07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentHour;
        int currentMinute;
        int currentSecond;

        System.out.print("Введите текущее количество часов: ");
        currentHour = sc.nextInt();
        if (currentHour < 0 || currentHour > 23) {
            System.out.print("Введите корректное количество часов: ");
            currentHour = sc.nextInt();
        }

        System.out.print("Введите текущее количество минут: ");
        currentMinute = sc.nextInt();
        if (currentMinute < 0 || currentMinute > 59) {
            System.out.print("Введите корректное количество минут: ");
            currentMinute = sc.nextInt();
        }

        System.out.print("Введите текущее количество секунд: ");
        currentSecond = sc.nextInt();
        if (currentSecond < 0 || currentSecond > 59) {
            System.out.print("Введите корректное количество секунд: ");
            currentSecond = sc.nextInt();
        }

        int hoursToAdd;
        int minutesToAdd;
        int secondsToAdd;

        System.out.print("Сколько часов вы хотите прибавить: ");
        hoursToAdd = sc.nextInt();

        System.out.print("Сколько минут вы хотите прибавить: ");
        minutesToAdd = sc.nextInt();

        System.out.print("Сколько секунд вы хотите прибавить: ");
        secondsToAdd = sc.nextInt();

        int totalSeconds = currentSecond + secondsToAdd;
        int totalMinutes = currentMinute + minutesToAdd + totalSeconds / 60;
        int totalHours = currentHour + hoursToAdd + totalMinutes / 60;

        currentSecond = totalSeconds % 60;
        currentMinute = totalMinutes % 60;
        currentHour = totalHours % 24;

        System.out.print("Итоговое время будет: " + currentHour + " часов " + currentMinute + " минут " + currentSecond + " секунд");
    }
}
