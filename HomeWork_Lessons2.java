package homeWork;

import java.util.Scanner;

public class HomeWork_Lessons2 {
    public static void main(String[] args) {

        /*
         Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        */

        int count2 = 0;
        for (int i = 1;i > 0 ; i=i*2) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            count2++;
            if(count2 == 21)
                break;
        }

        /*
        Создайте программу, выводящую на экран все неотрицательные элементы
        последовательности 90 85 80 75 70 65 60 ….
         */

        for (int i = 90; i > 0 ; i=i-5) {
            System.out.println(i);
        }

        /*
        Написать код, который будет проверять попало ли случайно сгенерированное целое число
        из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
        Примеры работы программы:
        Число 345 не содержится в интервале (25;200)
        Число 110 содержится в интервале (25;200)
         */

        int minRand = 10;
        int maxRand = 500;
        int random_number1 = minRand + (int) (Math.random() * maxRand);
        if(random_number1 >= 25 && random_number1 <= 200){
            System.out.println("Число " + random_number1 +" содержится в интервале (25;200)");
        }
        else{
            System.out.println("Число " + random_number1 +" не содержится в интервале (25;200)");
        }

        /*
        Задача на синтаксис switch. Дана целочисленная переменная (номер билета от пользователя):
        если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
        если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
        если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
        В остальных случаях сообщить, что приза нет.
         */

        int ticketNumber = 777;
        switch (ticketNumber){
            case 111:
            case 222:
            case 333:
                System.out.println("Вы получите книгу");
                break;
            case 444:
            case 555:
                System.out.println("Вы получите телефон");
                break;
            case 777:
                System.out.println("Вы получите ноутбук");
                break;
            default:
                System.out.println("Приза нет");
                break;
        }

        /*
        Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        если введен 0, выводит "выход из программы" (программа завершает работу)
         */

        int minimum = 1;
        int maximum = 9;
        int random_number = minimum + (int) (Math.random() * maximum);
        System.out.println(random_number);
        Scanner scanner1 = new Scanner(System.in);
        int inputData = scanner1.nextInt();
        while (true){
            if (inputData == 0){
                System.out.println("Выход из программы");
                break;
            }
            if (inputData > random_number){
                System.out.println("Загаданное число больше");
                break;
            }
            else if (inputData < random_number){
                System.out.println("Загаданное число меньше");
                break;
            }
            else if (inputData == random_number){
                System.out.println("Вы угадали");
                break;
            }
        }

        /*
        Пользователь! загадывает число в диапазоне от [1 до 100], программа пытается его угадать
        (используйте метод бинарного поиска - деление отрезка на 2).
        Программа может задавать пользователю вопросы: Число равно X? / Число больше X? / Число меньше X? и
        в зависимоти от ответа пользователя принимать решения.
        PS: вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
         */

        //Вариант 1
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ваше число равно 50?");
        int a = scanner3.nextInt();
        if(a == 1){
            System.out.println("Победа");
        }
        else if (a == 0){
            System.out.println("Ваше число меньше 50?");
            int b = scanner3.nextInt();
            if (b == 1){
                int c = 1;
                while (c < 50){
                    System.out.println("Ваше число " + c);
                    int c1 = scanner3.nextInt();
                    if (c1 == 1){
                        System.out.println("Победа");
                        break;
                    }
                    else if (c1 == 0){
                        c++;
                    }
                }

            }
            else if (b == 0){
                System.out.println("Ваше число больше 50?");
                int d = scanner3.nextInt();
                if (d == 0){
                    System.out.println("Error");
                }
                else if(d == 1){
                    int d1 = 51;
                    while (d1 <= 100){
                        System.out.println("Ваше число " + d1);
                        int d2 = scanner3.nextInt();
                        if (d2 == 0){
                            d1++;
                        }
                        else if (d2 == 1){
                            System.out.println("Победа");
                            break;
                        }
                    }
                }
            }
        }

        // Вариант 2
        Scanner scanner2 = new Scanner(System.in);
        int rnd, xx, yesNo = 0, min = 1, max = 100;
        rnd = (int)((min + max + 1)/2);
        while (yesNo == 0){
            System.out.println("Это число" + rnd);
            yesNo = scanner2.nextInt();
            if (yesNo == 1){
                System.out.println("Угадал");
            }
            else {
                System.out.println("число больше Х?");
                xx = scanner2.nextInt();
                if (xx == 1){
                    min = rnd;
                }
                else {
                    max = rnd;
                    rnd = (int)((min + max + 1) / 2);
                }
            }
        }














    }


}
