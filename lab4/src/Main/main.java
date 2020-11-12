package Main;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Task1("I like Java!!!");
        Task2("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
        Task3("Versions: Java 5, Java 6, Java 7, Java 8, Java 12.");
        Task4("fffff ab f 1234 jkjk");
        Task5("One two three раз два три one1 two2 123");
        Task6("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
    }
    private static void Task1(String str) {
        System.out.println("Task1");
        //б) Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(str.charAt(str.length()-1));
        //в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(str.endsWith("!!!"));
        //г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(str.startsWith("I like"));
        //д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(str.contains("Java"));
        //e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(str.indexOf("Java"));
        //ж) Заменить все символы “а” на “о”.
        System.out.println(str.replace("a","o"));
        //з) Преобразуйте строку к верхнему регистру.
        System.out.println(str.toUpperCase());
        //и) Преобразуйте строку к нижнему регистру.
        System.out.println(str.toLowerCase());
        //к) Вырезать строку Java c помощью метода String.substring().
        System.out.println(str.substring(str.indexOf("Java"),str.indexOf("Java")+4));
    }
    private static void Task2(String str) {
        System.out.println("Task2");
        String temp = str.toLowerCase();
        var results = "";
        for (var i = 0; i < 1;) {
            if (temp.contains("object-oriented programming")) {
                results += temp.indexOf("object-oriented programming");
                results += " ";
                temp=temp.substring(temp.indexOf("object-oriented programming")+"object-oriented programming".length(),temp.length());
            }
            else {
                i++;//конец если больше нет вхождений
            }
        }
        String[] result = results.split(" ");
        int[] indexs = new int[result.length];
        for(int i=0;i<result.length;i++){
            indexs[i] = Integer.parseInt(result[i]);
        }
        for(int i = indexs.length-1;i>=0;i--){
            for(int j = i-1;j>=0;j--){
                indexs[i]+=indexs[j];
            }
        }
        for(int i =0;i<indexs.length;i++){
            if(i!=0){
                indexs[i]+="object-oriented programming".length();
            }
            if(i%2!=0){
                String newTemp = str;
                str = newTemp.substring(0,indexs[i])+"OOP"+newTemp.substring(indexs[i]+"object-oriented programming".length()) ;
            }
        }
        //Конечный результат
        System.out.println(str);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static void Task3(String str) {
        System.out.println("Task3");
        String[] temp = str.split("Java ");
        for(int i =1;i<temp.length;i++){
            for(int j =0;j<1;){
                if(!isDigit(temp[i])){
                    temp[i] = temp[i].substring(0,temp[i].length()-1);
                }
                else{
                    j++;
                }
            }
            System.out.println("Java "+temp[i]);
        }
    }
    public static String[] toStringArray(Collection<String> list) {
        String[] result = new String[list.size()];
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }
    public static List<String> findWords(String[] sourceStrings) {
        Pattern wordPattern = Pattern.compile("[а-яa-z0-9]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceStrings) {
            Matcher wordMatcher = wordPattern.matcher(word.toLowerCase());
            if (wordMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }
    public static int countDifferentSymbolsInWord(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }
    public static void findWordWithMinDifferentSymbols(String[] sourceWords) {
        final String message = "Слово, в котором число различных символов минимально (число различных символов): ";
        if (sourceWords.length == 0) {
            System.out.println(message + "Нет слов");
            return;
        }
        String result = sourceWords[0];
        for (int i = 1; i < sourceWords.length; i++) {
            if (countDifferentSymbolsInWord(result) > countDifferentSymbolsInWord(sourceWords[i])) {
                result = sourceWords[i];
            }
        }
        System.out.println(message + result + "(" + countDifferentSymbolsInWord(result)
                + ")");
    }
    private static void Task4(String str) {
        System.out.println("Task4");
        String[] sourceWords = toStringArray(findWords(str.split(" ")));
        findWordWithMinDifferentSymbols(sourceWords);
    }
    private static void Task5(String str) {
        System.out.println("Task5");
        String[] temp = str.split(" ");
        int countWords = 0;

        Pattern wordPattern = Pattern.compile("[a-z]+");
        for (String word : temp) {
            Matcher wordMatcher = wordPattern.matcher(word.toLowerCase());
            if (wordMatcher.matches()) {
                countWords++;
                System.out.println(word);
            }
        }

        System.out.println("Количество слов, содержащих только символы латинского алфавита = " + countWords);
    }
    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        return numericMatcher.matches();
    }
    public static void findPalindromicWord(String[] sourceWords) {
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrome = word.equals(new StringBuilder(word)
                        .reverse().toString());
                if (isInputPalindrome) {
                    System.out.println("Слово-палиндром, состоящее только из цифр: " + word);
                }
            }
        }
    }
    private static void Task6(String str) {
        System.out.println("Task6");
        findPalindromicWord(str.split(" "));
    }
}