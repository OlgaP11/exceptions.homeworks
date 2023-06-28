package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число: ");

        while (!scan.hasNextFloat()){
            System.out.println("Необходимо ввести дробное число: ");
            scan.next();
        }

        float num = scan.nextFloat();
        System.out.println(num);
        scan.close();
    }
}
