import java.util.Scanner;

public class Zadacha09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите пожалуйста ваше кол-во байтов: ");
        long bytes = sc.nextLong();


        double kilobytes = bytes / 1024.0;
        System.out.println("Байты переведённые в килобайты: " + kilobytes);

        double megabytes = kilobytes / 1024.0;
        System.out.println("Байты переведённые в мегабайты: " + megabytes);

        double gigabytes = megabytes / 1024.0;
        System.out.println("Байты переведённые в гигабайты: " + gigabytes);

        double terabytes = gigabytes / 1024.0;
        System.out.println("Байты переведённые в терабайты: " + terabytes);
    }

}
