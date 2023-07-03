package homework3.exceptions.impl;

import homework3.exceptions.PersonDataFormatException;

public class IncorrectDateFormatException extends PersonDataFormatException {
    public IncorrectDateFormatException() {
        System.out.println("Неверный формат даты рождения. Запись в файл не произведена.");
    }
}
