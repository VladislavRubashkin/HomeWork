package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_Lessons5 {
    public static void main(String[] args) {

         /*
        Заполнить массив
        Задать массив на N слов.
        В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в
        массив можно только, если в нем его еще нет). В итоге в массиве будут только уникальные слова.
        Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
        Перед завершением программы, вывести получившийся массив в консоль
         */

        int N = 5;
        int count = 0;
        String inputWord;
        String[] stringArray = new String[N];
        Scanner input = new Scanner(System.in);

        Arrays.fill(stringArray, "");
        System.out.println("Введите слово (для выхода - введите exit): ");
        do {
            boolean flag = true;
            inputWord = input.nextLine();
            if (inputWord.equals("exit")) {
                break;
            }
            for (int j = 0; j < count; j++) {
                if (stringArray[j].equals(inputWord)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringArray[count] += inputWord;
                count++;
            }
        } while (count < stringArray.length);
        System.out.println(Arrays.toString(stringArray));


        /*
        Найти количество вхождений одной строки в другую.
        Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
         */

//        String string1 = "дом домик ";
//        String []splitArray = string1.split("\\дом");
//        System.out.println( (splitArray.length - 1 ) + " штук.");

        String mas = "кот";
        int count1 = 0;
        String[] arrMas = {"котофей","кот","котище","котовый","котовася"};
        for (int i = 0; i < arrMas.length; i++) {
            if (arrMas[i].contains(mas)){
                count++;
            }
        }
        System.out.println("Символы " + mas + " содержатся в массиве " + count1 + " раз(а)");


        /*
        Написать функцию, которая проверяет, является ли строка палиндромом.
        Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или
        по словам как слева направо, так и справа налево.
        Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
         */

        String str= "151515";
        str.toLowerCase();
        char[] strToArray = str.toCharArray();
        char[] strToArray1 = new char[strToArray.length];
        for (int i = strToArray.length - 1; i > 0; ) {
            for (int j = 0; j < strToArray.length; j++) {
                strToArray1[j] = strToArray[i];
                i--;
            }
        }
        if (Arrays.equals(strToArray, strToArray1)){
            System.out.println(str + " является полиндромом");
        }
        else{
            System.out.println(str + " не является полиндромом");
        }

     /*
     Заменить все буквы в слове на строчные, а первую букву на заглавную
     Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
      */

        String a = "woRLd";
        String b = a.toLowerCase();
        char firstSymbol = Character.toUpperCase(b.charAt(0));
        String result = firstSymbol + b.substring(1);
        System.out.println(result);

        /*
        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
        Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
         */

        String longString = "в предложении все слова разной длины";
        String[] arrLongString = longString.split(" ");
        String max = arrLongString[0];
        for (int i = 0; i < arrLongString.length; i++) {
            if (arrLongString[i].length() > max.length()){
                max = arrLongString[i];
            }
        }
        System.out.println("Самое длинное слово в данном предложении: " + max);


    }

}
