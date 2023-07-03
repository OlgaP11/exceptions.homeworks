package homework3.exceptions;

public class IncorrectDateFormatException extends Exception{
    public IncorrectDateFormatException() {
        System.out.println("Неверный формат даты рождения. Запись в файл не произведена.");
    }
}
