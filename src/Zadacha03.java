import java.util.Scanner;

public class Zadacha03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую сторону: ");
        double a = sc.nextDouble();

        System.out.print("Введите вторую сторону: ");
        double b = sc.nextDouble();

        System.out.print("Введите угол в градусах: ");
        double y = sc.nextDouble();

        y = Math.toRadians(y);

        double square = (a * b) / 2 * Math.sin(y);

        System.out.println("Площадь данного треугольника: " + square);
    }
}
