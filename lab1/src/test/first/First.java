package test.first;

/*Программа выдает на экран все аргументы, переданные ей через командную строку.
Основной класс программы (с функцией main()) находится в пакете test.first.
 */

public class First {
    public static void main(String[] args) {
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
