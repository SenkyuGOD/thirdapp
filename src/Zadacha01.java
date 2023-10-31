import java.util.Scanner;

public class Zadacha01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число через запятую: ");
        double d = sc.nextDouble();

        double a = (int) d / 1000.0;


        double b = (int) ((d - (int) d) * 1000);

        System.out.println(a + b);
    }
}
