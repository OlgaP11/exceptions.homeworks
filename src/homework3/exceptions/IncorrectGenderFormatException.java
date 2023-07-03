package homework3.exceptions;

public class IncorrectGenderFormatException extends Exception{
    public IncorrectGenderFormatException() {
        System.out.println("Некорретно введен пол. Запись в файл не произведена.");
    }
}
