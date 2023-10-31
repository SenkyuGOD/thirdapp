import java.util.Scanner;

public class Zadacha05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение радианы: ");
        double rad = sc.nextDouble();

        double degrees = Math.toDegrees(rad);

        int roundedDegrees = (int) Math.floor(degrees);

        double min = (degrees - roundedDegrees) * 60;

        int roundedMin = (int) Math.floor(min);

        double sec = (min - roundedMin) * 60;

        int roundedSec = (int) Math.floor(sec);

        System.out.println("В вашей радиане: " + roundedDegrees + " градусов " + roundedMin + " минут " + roundedSec + " секунд");
    }
}
