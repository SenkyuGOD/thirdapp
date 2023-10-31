import java.util.Scanner;

public class Zadacha06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;


        System.out.print("Введите сторону а: ");
        a = sc.nextDouble();

        System.out.print("Введите сторону b: ");
        b = sc.nextDouble();

        System.out.print("Введите сторону c: ");
        c = sc.nextDouble();


        double cosA = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double cosB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);


        double angleAInRadians = Math.acos(cosA);
        double angleBInRadians = Math.acos(cosB);
        double angleCINRadians = Math.toRadians(180) - (angleAInRadians + angleBInRadians);


        double angleAInDegrees = Math.toDegrees(angleAInRadians);
        double angleBInDegrees = Math.toDegrees(angleBInRadians);
        double angleCInDegrees = Math.toDegrees(angleCINRadians);


        System.out.println("Угол А в радианах: " + angleAInRadians + " угол В в радианах: " + angleBInRadians + " угол С в радианах: " + angleCINRadians);
        System.out.println("Угол А в градусах: " + angleAInDegrees + " угол В в градусах: " + angleBInDegrees + " угол С в градусах: " + angleCInDegrees);

    }
}
