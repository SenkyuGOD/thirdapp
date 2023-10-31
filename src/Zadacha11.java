import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;


        System.out.print("Введите четырёхзначное число: ");
        number = sc.nextInt();

        int num1;
        int num2;
        int num3;
        int num4;

        int evenNumbers = 1;
        int oddNumbers = 1;


        num1 = number / 1000;
        if (num1 % 2 == 0) {
            evenNumbers = evenNumbers * num1;
        } else {
            oddNumbers = oddNumbers * num1;
        }

        num2 = number / 100 % 10;
        if (num2 % 2 == 0) {
            evenNumbers = evenNumbers * num2;
        } else {
            oddNumbers = oddNumbers * num2;
        }

        num3 = number % 100 / 10;
        if (num3 % 2 == 0) {
            evenNumbers = evenNumbers * num3;
        } else {
            oddNumbers = oddNumbers * num3;
        }

        num4 = number % 10;
        if (num4 % 2 == 0) {
            evenNumbers = evenNumbers * num4;
        } else {
            oddNumbers = oddNumbers * num4;
        }

        System.out.println("Произведение четных чисел: " + evenNumbers);
        System.out.println("Произведение нечетных чисел: " + oddNumbers);
    }
}
