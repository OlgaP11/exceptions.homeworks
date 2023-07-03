package homework3.exceptions;

public class IncorrectPhoneNumberFormatException extends Exception{
    public IncorrectPhoneNumberFormatException() {
        System.out.println("Введен некорректный номер телефона. Запись в файл не произведена.");
    }
}
