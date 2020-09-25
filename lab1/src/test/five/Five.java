package test.five;

import java.util.Scanner;

/*Создайте программу, вычисляющую факториал целого числа.
 */
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input int for Factorial");
        System.out.println("Factorial = "+Factorial(in.nextInt()));
    }
    private static int Factorial(int fact) {
        int temp = 1;
        for(int i = 1;i<=fact;i++){
            temp=temp*i;
        }
        return temp;
    }
}
