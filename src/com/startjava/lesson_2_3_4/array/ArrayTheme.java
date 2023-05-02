package com.startjava.lesson_2_3_4.array;


public class ArrayTheme {
    public static void main(String[] args) {
        /*
        Код, записанный в традиционном стиле:
         int[] nums = new int[10];
         for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i]);
         }

         Тот же самый код, но с использованием for-each:
         int[] nums = new int[10];
         for (int num : nums) {
             System.out.print(num);
         }
         */
        // TODO: 11.03.2023 1.	Реверс значений массива
        // a.	заполните массив числами вразнобой в промежутке [1, 7], используя сокращенную форму инициализации
        // b.	переставьте значения в исходном массиве в обратном порядке
        // c.	при этом берите значения для перезаписи из самого массива
        // d.	не используйте сортировку
        // e.	отобразите значения массива в две строки до модификации и после, отделяя числа друг от друга пробелом
        System.out.println("1.Реверс значений массива");
        int[] numbers1 = {7, 3, 6, 4, 5, 1, 2};
        for (int j : numbers1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i <= numbers1.length - 1; i++) {
            System.out.print(numbers1[numbers1.length - 1 - i] + " ");
            if (i == 6) {
                break;
            }
        }
        System.out.println();
        System.out.println();

        // TODO: 17.03.2023 2.	Вывод произведения элементов массива
        //a.	заполните массив в цикле цифрами в промежутке [0, 9] по возрастанию
        //b.	подсчитайте их произведение (без учета 0 и 9). Числа берите из массива
        //c.	отобразите:
        //i.	в цикле произведение в формате 1 * 2 *… * 8 = R  //40320
        //ii.	0 и 9 (берите из массива) отдельной строкой, указав их индексы
        //d.	для вывода произведения используйте тернарный оператор вместо if
        System.out.println("2.Вывод произведения элементов массива");

        int[] arrNum = new int[10];
        for (int i = 0; i < arrNum.length; i++) {  // создаёт массив
            arrNum[i] = i;
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
        System.out.println("корректировка цикла");
        int sumArr = 1;
        for (int i = 1; i < arrNum.length - 1; i++) {
            int d = arrNum[i];
            sumArr = sumArr * d;
            if (i == 1) {
                System.out.print(arrNum[0] + " " + arrNum[9]);
                System.out.println();
            }
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();
        System.out.print("1 * 2 *… * 8 = " + sumArr);
        System.out.println();
        System.out.println();

        // TODO: 25.03.2023 3.	Удаление элементов массива
        //a.	+заполните массив размерностью 15 случайными вещественными числами в полуинтервале [0, 1)
        //b.	+вычислите индекс средней ячейки массива, а затем возьмите из нее число
        //c.	+перезапишите в массиве нулями все числа, которые больше этого значения
        //d.	отобразите:
        //    i.	исходный и измененный массив по 8 и 7 чисел в строке
        //    ii.	при этом после запятой отображайте только три знака
        //    iii.	выделяйте под каждое число с помощью форматирования одинаковое количество позиций,
        //           чтобы числа были выровнены в каждом столбце по правому краю
        //    iv.	количество обнуленных ячеек

        System.out.println("3.Удаление элементов массива");

        float[] arrayDel = new float[15];
        for (int q = 0; q < arrayDel.length; q++) {
            float a = (float) Math.random();
            arrayDel[q] = a;
            if (q == 8) {
                System.out.println();
                System.out.print("      ");
            }
            System.out.printf("%.3f", arrayDel[q]);
            System.out.print(" ");
            if (q == 14) {
                int w = arrayDel.length / 2;
                System.out.println();
                System.out.printf("%.3f", arrayDel[w]);
                System.out.println();
            }
        }
        int w = arrayDel.length / 2;
        int sumArrDell = 0;
        for (int q = 0; q < arrayDel.length; q++) {
            if (arrayDel[w] >= arrayDel[q]) {
                System.out.printf("%.3f", arrayDel[q]);
                System.out.print(" ");
            } else if (arrayDel[w] < arrayDel[q]) {
                arrayDel[q] = 0;
                System.out.printf("%.3f", arrayDel[q]);
                System.out.print(" ");
                sumArrDell ++;
            }
            if (q == 7) {
                System.out.println();
                System.out.print("      ");
            }
        }
        System.out.println();
        System.out.println("Количество обнулённых ячеек: " + sumArrDell + " из 15");
        System.out.println();

        // TODO: 28.03.2023 4.	Вывод элементов массива лесенкой в обратном порядке
        //a.	создайте массив, заполнив его в цикле большими анг. буквами по возрастанию
        //b.	отобразите его содержимое лесенкой в обратном порядке в следующем формате:
        // Z
        //ZY   [90;60]
        //ZYX
        //ZYXW

        System.out.println("4.Вывод элементов массива лесенкой в обратном порядке");
        System.out.println();
        char[] arrChar = new char[0];
         for (int i = 0; i < arrChar.length-1; i++) {

         }


/*
        int sumA = 0;
        for (int r = 90; r >= 65; r--) {
            char[] arrChar = new char[r+1];
            arrChar[r] = (char) r;
            for (int i = 0; i < arrChar.length-1; i++ ) {
                sumA = r - i;
                System.out.print((char) arrChar[sumA] + " " );
                // System.out.printf("%1." + sumA + "s%n", arrChar[sumA]);
            }
            System.out.println();
            1 инициализируем массив числами 90-65
            2 печатаем 1  строка 1 и 2чл и так до конца массива

        }*/



      /*
      sp x spln
      sp x sp x-1 spln
      sp x sp x-1 sp x-1-1 spln


        int k6 = 5;
        while (k6 > 0) {
            System.out.printf("%1." + k6 + "s%n", "#####");
            k6--;
        }



*/



        /*
        for (int g = 0; g < arrNum.length-1; g++) {
            for (int i = 90; i >= 65; i--) {
                System.out.print((char)i + " ");
                arrChar[g] = (char) i;
            }
            System.out.println(arrChar[g]);
        }


       /*
        for (int i = 90; i>=65; i-- ) {
            arrChar[i] = i;
            System.out.print((char)arrChar[i] + " ");
        }
*/


























    }
}