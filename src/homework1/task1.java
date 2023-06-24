package homework1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Выберите интересующую операцию: \n" +
                    "1 - запись в файл \n" +
                    "2 - узнать счастливое число \n" +
                    "3 - деление двух чисел");
            int userAnswer = scan.nextInt();

            if (userAnswer == 1) {
                System.out.println("Введите название файла, в который вы хотите осуществить запись: ");
                String file = scan.nextLine();
                System.out.println("Введите текст для записи: ");
                String text = scan.nextLine();
                writeDown(file, text);

            } else if (userAnswer == 2) {
                System.out.println("Введите день, в который вы родились, чтобы узнать свое счастливое число");
                int currIndex = scan.nextInt();
                luckyNumber(currIndex);

            } else if (userAnswer == 3) {
                System.out.println("Деление двух чисел. Введите первое число: ");
                int number1 = scan.nextInt();
                System.out.println("Введите второе число: ");
                int number2 = scan.nextInt();
                int result = divide(number1, number2);
                System.out.printf("Результат деления %d", result);

            } else {
                System.out.println("Операции с таким номером нет =)");
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы ввели недопустимое значение");
        } catch (ArithmeticException e){
            System.out.println("Деление на 0 недопустимо.");
        }

        scan.close();

    }

    public static void writeDown (String pathToFile, String text) throws IOException {
        Path path = Paths.get(pathToFile);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        bufferedWriter.write(text);
        bufferedWriter.close();
    }

    public static void luckyNumber (int index) throws ArrayIndexOutOfBoundsException{
        int [] nums = new int []
                {1, 2, 5, 7, 9, 8, 6, 3, 1, 4, 1, 2, 5, 7, 9, 8, 6, 3, 1, 4, 1, 2, 5, 7, 9, 8, 6, 3, 1, 4, 7};
        System.out.printf("Ваше счастливое число на сегодня %d!\n", nums[index]);
    }

    public static int divide (int num1, int num2) {
        return num1/num2;
    }
}
