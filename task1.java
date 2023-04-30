// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331


import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        
        int n = 1001;
        int[] cubes = new int[n];
        for (int i = 1; i < n; i++){
            cubes[i] = i * i * i;
        }


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter the 1st number from 1 to 1000: ");
        int x = iScanner.nextInt();
        System.out.printf("enter the 2nd number from 1 to 1000: ");
        int y = iScanner.nextInt();
        iScanner.close();
        
        System.out.println(cubes[x]);
        System.out.println(cubes[y]);

        System.out.println();
    
    }
}


// this is an update of the task
