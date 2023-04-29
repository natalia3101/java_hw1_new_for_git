// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("What operation would you like to do?\nChoose one of the following numbers\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        int n = iScanner.nextInt();
        System.out.println("Enter the 1st number: ");
        int x = iScanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int y = iScanner.nextInt();

        int result = 0;

        switch (n) {
            case 1:
                result = x + y;
                System.out.printf("Ответ %d", result);
                break;

            case 2:
                result = x - y;
                System.out.printf("Ответ %d", result);
                break;

            case 3:
                result = x * y;
                System.out.printf("Ответ %d", result);
                break;

            case 4:
                result = x / y;
                System.out.printf("Ответ %d", result);
                break;

            default:
                System.out.printf("Enter a number from 1 to 4");
                break;

        }

        iScanner.close();
    }
}
