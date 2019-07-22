import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {

        int i = 0;
        int st = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Задайте размер матрицы, строки: ");
        int x = in.nextInt();
        System.out.print("Задайте размер матрицы, столбцы: ");
        int y = in.nextInt();

        int massive[] []= new int[x] [y]; // создается матрица с заданным количеством строк и столбцов

        do {                                                                // тут два цикла do-while, обеспечивающие ввод значений в
            System.out.println("Введите значения для строки " + st);        // матрицу

            do {
                massive[st][i] = in.nextInt();
                i++;
            }
            while (i < y);

            i = 0;
            st++;
            
        } while (st < x);

        System.out.println (""); // это просто отступ для красоты

        for (int n = 0; n < y; n++) // Вывод содержимого первой строчки массива на экран
        {
            System.out.print(massive[0][n]*3 + " ");
        }

    }
}
