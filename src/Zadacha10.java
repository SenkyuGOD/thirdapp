import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double M;
        double N;

        System.out.print("Введите НАТУРАЛЬНОЕ число: ");
        M = sc.nextInt();


        System.out.print("Введите НАТУРАЛЬНОЕ число: ");
        N = sc.nextInt();

        double privateNumber = M / N;

        int wholeNumber;
        double fractionalNumber;


        wholeNumber = (int) (privateNumber);
        fractionalNumber = privateNumber - wholeNumber;




        int min = wholeNumber % 10;
        int buff1;

        while (wholeNumber > 0) {
            buff1 = wholeNumber % 10;
            if (min > buff1) {
                min = buff1;
            }
            wholeNumber /= 10;
        }
        System.out.println("Минимальная цифра в целочисленной части: " + min);


        while (fractionalNumber % 10 > 0 ){
            fractionalNumber *= 10;

        }


        int fractionalNumber1 = (int)fractionalNumber;
        int max = 1;
        int buff2;

        while(fractionalNumber1 > 0){
            buff2 = fractionalNumber1 % 10;
            if(max<buff2){
                max = buff2;
            }
            fractionalNumber1 /= 10;
        }
        System.out.println("Максимальная цифра в дробной части: " + max);

    }
}
