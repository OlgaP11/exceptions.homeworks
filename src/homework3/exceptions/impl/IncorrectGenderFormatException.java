package homework3.exceptions.impl;

import homework3.exceptions.PersonDataFormatException;

public class IncorrectGenderFormatException extends PersonDataFormatException {
    public IncorrectGenderFormatException() {
        System.out.println("Некорретно введен пол. Запись в файл не произведена.");
    }
}
