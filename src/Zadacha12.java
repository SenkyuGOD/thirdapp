import java.util.Scanner;

public class Zadacha12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число N:");
        int N = sc.nextInt();
        boolean isEvenTwoDigit = (N >= 10 && N <= 99 && N % 2 == 0);
        System.out.println("Целое число N является четным двузначным числом: " + isEvenTwoDigit);

        System.out.print("Введите четырёхзначное число: ");
        int condition2 = sc.nextInt();
        int firstTwoDigitsSum = (condition2 / 1000 + (condition2 / 100) % 10);
        int lastTwoDigitsSum = ((condition2 / 10) % 10 + condition2 % 10);
        boolean sumsAreEqual = (firstTwoDigitsSum == lastTwoDigitsSum);
        System.out.println("Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр: " + sumsAreEqual);


        System.out.print("Введите трехзначное число: ");
        int condition3 = sc.nextInt();
        int sumOfDigits = (condition3 / 100 + (condition3 / 10) % 10 + condition3 % 10);
        boolean isSumEven = (sumOfDigits % 2 == 0);
        System.out.println("Сумма цифр данного трехзначного числа N является четным числом: " + isSumEven);


        System.out.print("Введите значение x: ");
        int x = sc.nextInt();
        int m = x;
        int n = x;
        boolean isInBetween = (x >= m && x <= n);
        System.out.println("Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми x=m, х=n (m<n): " + isInBetween);


        System.out.print("Введите трехзначное число: ");
        int condition5 = sc.nextInt();
        int sumOfDigits5 = (condition5 / 100 + (condition5 / 10) % 10 + condition5 % 10);
        boolean isConditionMet5 = (N * N == sumOfDigits5 * sumOfDigits5 * sumOfDigits5);
        System.out.println("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа: " + isConditionMet5);


        System.out.print("Введите длинну стороны а: ");
        int a = sc.nextInt();
        System.out.print("Введите длинну стороны b: ");
        int b = sc.nextInt();
        System.out.print("Введите длинну сторны с: ");
        int c = sc.nextInt();
        boolean isIsosceles = (a == b || a == c || b == c);
        System.out.println("Треугольник со сторонами а,b,с является равнобедренным: " + isIsosceles);


        System.out.print("Введите трёхзначное число: ");
        int condition7 = sc.nextInt();
        int digit1 = condition7 / 100;
        int digit2 = (condition7 / 10) % 10;
        int digit3 = condition7 % 10;
        boolean isConditionMet7 = (digit1 + digit2 == digit3 || digit1 + digit3 == digit2 || digit2 + digit3 == digit1);
        System.out.println("Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре: " + isConditionMet7);


        System.out.print("Введите число N: ");
        int condition8 = sc.nextInt();
        System.out.print("Введите число а: ");
        int a1 = sc.nextInt();
        System.out.print("Введите степень числа а (показатель степени может находиться в диапазоне от 0 до 4): ");
        int exponent = sc.nextInt();
        boolean isPowerOfA = (condition8 == Math.pow(a1, exponent));
        System.out.println("Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4): " + isPowerOfA);


        System.out.print("Введите коэф а: ");
        double a2 = sc.nextDouble();
        System.out.print("Введите коэф b: ");
        double b2 = sc.nextDouble();
        System.out.print("Введите коэф с: ");
        double c2 = sc.nextDouble();
        System.out.print("Введите координату точки (m): ");
        double m2 = sc.nextDouble();
        System.out.print("Введите координату точки (n): ");
        double n2 = sc.nextDouble();
        boolean isOnGraph = (n2 == a2 * m * m + b2 * m + c2);
        System.out.println("График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m, n): " + isOnGraph);
    }


}
