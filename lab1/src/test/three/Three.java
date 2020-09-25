package test.three;

/*
Программа, в которой все переданные во входную строку аргументы выводятся на экран в обратной порядке.
Например, если было передано 2 аргумента – make install, то на экран должно вывестись llatsni ekam.
Примечание*: для разбора слова по буквам необходимо использовать функцию charAt().
Например, str.charAt(i) вернет символ с позиции i в слове, записанном в строковую переменную str.
Команда str.length() возвращает длину слова str.
 */
public class Three {
    private final static StringBuilder sb = new StringBuilder();

    public static String reverse (final String word) {
        sb.setLength(0);
        sb.append(word.toCharArray());

        return sb.reverse().toString();
    }

    public static void main (String [] args) {
        String [] result = new String[args.length];
        int j = 0;

        for (int i = args.length - 1; i >= 0; i--) {
            result[j++] = reverse(args[i]);
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
