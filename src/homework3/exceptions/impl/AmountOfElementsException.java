package homework3.exceptions.impl;

import homework3.exceptions.PersonDataFormatException;

public class AmountOfElementsException extends PersonDataFormatException {
    private int amountOfElements;
    private static final int CORRECT_AMOUNT_OF_ELEMS = 6;

    public AmountOfElementsException(int amountOfElements) {
        this.amountOfElements = amountOfElements;
        if(amountOfElements > CORRECT_AMOUNT_OF_ELEMS){
            System.out.println("Данных ввведено больше, чем требуется. Запись в файл не произведена.");
        } else if (amountOfElements < CORRECT_AMOUNT_OF_ELEMS) {
            System.out.println("Данных введено меньше, чем нужно. Запись в файл не произведена.");
        }
    }
}
