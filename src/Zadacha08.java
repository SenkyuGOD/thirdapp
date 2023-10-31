import java.util.Scanner;

public class Zadacha08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        String str;
        System.out.print("Enter one character > ");
        str = sc.next();
        System.out.println("str=" + str);

        char ch = str.charAt(0);
        System.out.println(ch);

        int code = ch;
        System.out.println("code = " + code);

        System.out.println("prev = " + (char) (code - 1));
        System.out.println("next = " + (char) (code + 1));

        char ch2 = (char) (code + 1);
        System.out.println("ch2 = " + ch2);
    }
}
