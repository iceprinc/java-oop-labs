package test.six;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте программу, вычисляющую простые числа с применением алгоритма
«Решето Эратосфена». Этот алгоритм находит простые числа путем исключения
всех чисел, кратных меньшим простым.
 */
public class Six {
    private static boolean[] primes;
    public static void Eratosfen(int n) {
        primes=new boolean[n+1];
    }
    public static void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input int for Eratosfen");
        Eratosfen(in.nextInt());
        fillSieve();
        for(int i =0;i< primes.length;i++)
            System.out.println(i+" - "+primes[i]);
    }
}
