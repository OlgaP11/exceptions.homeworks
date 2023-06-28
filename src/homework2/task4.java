package homework2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        if (text.equals(" ") || text.equals("")) throw new RuntimeException("Пустые строки вводить нельзя!");
    }
}
