package homework3.exceptions.impl;

import homework3.exceptions.PersonDataFormatException;

public class IncorrectPhoneNumberFormatException extends PersonDataFormatException {
    public IncorrectPhoneNumberFormatException() {
        System.out.println("Введен некорректный номер телефона. Запись в файл не произведена.");
    }
}
