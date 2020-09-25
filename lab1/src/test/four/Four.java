package test.four;

import java.util.Scanner;

/*Создайте программу, вычисляющую числа Фибоначчи. Числа Фибоначчи – последовательность чисел,
в котором каждое следующее число равно сумме двух предыдущих.
Начало этой последовательности – числа 1, 1, 2, 3, 5, 8, 13…
Количество выведенных чисел вводится в качестве аргумента.
 */
public class Four {
    private static void Fibonacci(int lenght){
        int temp1 =0;
        int temp2 =0;
        for(int i =0;i<lenght-2;i++){
            if(i==0){
                temp1=1;
                temp2=1;
                System.out.println(temp1);
                System.out.println(temp2);
            }
            else if(i%2==0)
                temp1=temp1+temp2;
            else
                temp2=temp1+temp2;
            System.out.println(temp1+temp2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input length for Fibonacci");
        Fibonacci(in.nextInt());
    }
}
