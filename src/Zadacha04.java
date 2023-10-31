import java.util.Scanner;

public class Zadacha04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение а: ");
        double a = sc.nextDouble();

        double a2 = a * a;

        double a4 = a2 * a2;

        double a8 = a4 * a4;

        double a10 = a8 * a2;

        System.out.println("a^8 = " + a8);
        System.out.println("a^10 = " + a10);
    }
}
