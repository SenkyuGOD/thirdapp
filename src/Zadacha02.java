public class Zadacha02 {
    public static void main(String[] args) {
        double a = 4;
        double b = 4;
        double c = 1;

        double D = Math.pow(b, 2) - (4 * a * c);

        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);

            System.out.println("Уравнение имеет два корня");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень");
            System.out.println("x = " + x);
        } else {
            System.out.println("Уровнение не имеет корней");
        }
    }
}