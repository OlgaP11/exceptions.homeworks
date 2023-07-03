package homework3.exceptions.impl;

import homework3.exceptions.PersonDataFormatException;

public class PersonNameFormatException extends PersonDataFormatException {
    public PersonNameFormatException() {
        System.out.println("Неверно введены ФИО. Запись в файл не произведена.");
    }
}
