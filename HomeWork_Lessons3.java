package homeWork;

public class HomeWork_Lessons3 {
    public static void main(String[] args) {

        /*
        Заполните массив на N элементов случайным целыми числами и выведете максимальное,
        минимальное и среднее значение
         */

        int N = 5;
        int[] arrayInt = new int[N];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ((int)(Math.random()*100) - 5);
            System.out.println(arrayInt[i]);
        }
        System.out.println("");

        int minArrayInt = arrayInt[0];
        for (int i = 1; i < arrayInt.length; i++)
            if (arrayInt[i] < minArrayInt) {
                minArrayInt = arrayInt[i];
            }
        System.out.println("Минимально значение: " + minArrayInt);

        int maxArrayInt = arrayInt[0];
        for (int i = 1; i < arrayInt.length; i++)
            if (arrayInt[i] > maxArrayInt) {
                maxArrayInt = arrayInt[i];
            }
        System.out.println("Максимальное значение: " + maxArrayInt);

        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        double middleArrayInt = sum / (double)N;
        System.out.println("Среднее арифметическое: " + middleArrayInt);


        /*
        Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль
        в обратном порядке (20 18 16 ... 4 2)
         */

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1)*2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[9 - i]);
        }
//        for (int i = 9; i < numbers.length; i--) {
//            System.out.println(numbers[i]);
//            if(numbers[i] == numbers[0]){
//                break;
//            }
//        }

        /*
        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
         */

        int[] randInt = new int[11];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < randInt.length; i++) {
            randInt[i] = ((int)(Math.random()*3) - 1);
            System.out.println(randInt[i]);
        }
        System.out.println("");

        for (int i = 0; i < randInt.length; i++) {
            if (randInt[i] == -1){
                count++;
            }
            else if (randInt[i] == 0){
                count1++;
            }
            else if (randInt[i] == 1){
                count2++;
            }
        }
        int result = (count > count1) ? count : count1;
        int result2 = (count1 > count2) ? count1 : count2;

        if (count == count1 || count == count2 || count1 == count2){
            return;
        }
        else {
            System.out.println((result > result2) ? result : result2);
        }

    }
}
