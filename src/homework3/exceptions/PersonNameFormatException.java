package homework3.exceptions;

public class PersonNameFormatException extends Exception{
    public PersonNameFormatException() {
        System.out.println("Неверно введены ФИО. Запись в файл не произведена.");
    }
}
