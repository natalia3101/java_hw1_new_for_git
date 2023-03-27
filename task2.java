// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10


import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter the number of elements in the array: ");
        int n = iScanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iScanner.nextInt();
        }

        System.out.printf("enter a number to multiply: ");
        int m = iScanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * m);
        }


        iScanner.close();
    }
}
