package homework3;

import homework3.exceptions.PersonDataFormatException;
import homework3.exceptions.impl.*;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class FillingDatabaseByPeople {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Введите следующие данные:\n" +
                    "фамилию, имя, отчество, " +
                    "дату рождения в формате ДД.ММ.ГГГГ, " +
                    "номер телефона (только цифры), " +
                    "пол (f - женский, m - мужской).\n" +
                    "Данные необходимо ввести одной строкой через пробел:\n" +
                    "Фамилия Имя Отчество датарождения номертелефона пол");

            String[] data = scan.nextLine().split(" ");

            if (data.length != 6) {
                throw new AmountOfElementsException(data.length);
            } else {
                String lastName = data[0];
                String firstName = data[1];
                String patronymic = data[2];
                String dateOfBirth = data[3];
                String phoneNumber = data[4];
                String gender = data[5];

                isString(lastName);
                isString(firstName);
                isString(patronymic);
                checkDateFormat(dateOfBirth);
                checkPhoneNumber(phoneNumber);
                checkGender(gender);

                Person person = new Person(lastName, firstName, patronymic, dateOfBirth, phoneNumber, gender);

                if (writeData(lastName, person.toString())) {
                    System.out.println("Данные успешно записаны.");
                }
            }

        } catch (PersonDataFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Данные не были записаны. Ошибка при работе с файлом.");
        }
    }

    public static boolean isString (String string) throws PersonNameFormatException {
        try{
            Integer.parseInt(string);
            throw new PersonNameFormatException();
        } catch (NumberFormatException e){
            return true;
        }
    }

    public static boolean checkPhoneNumber (String number) throws IncorrectPhoneNumberFormatException {
        try{
            Long.parseLong(number);
            return true;
        } catch (NumberFormatException e){
            throw new IncorrectPhoneNumberFormatException();
        }
    }

    public static boolean checkGender(String string) throws IncorrectGenderFormatException {
            if (string.equals("f") || string.equals("m")) {
                return true;
            } else {
                throw new IncorrectGenderFormatException();
            }
    }

    public static boolean checkDateFormat(String string) throws IncorrectDateFormatException {
        if (string.length() == 10 && string.charAt(2)=='.' && string.charAt(5)=='.' ) {

            int day = Integer.parseInt(String.valueOf(string.charAt(0)) + String.valueOf(string.charAt(1)));
            int month = Integer.parseInt(String.valueOf(string.charAt(3)) + String.valueOf(string.charAt(4)));
            int year = Integer.parseInt(String.valueOf(string.charAt(6)) + String.valueOf(string.charAt(7)) +
                    String.valueOf(string.charAt(8)) + String.valueOf(string.charAt(9)));

            if (day < 0 || day > 31 || month < 0 || month > 12 || year < 0 || year > LocalDate.now().getYear()){
                throw new IncorrectDateFormatException();
            }

            return true;
        } else {
            throw new IncorrectDateFormatException();
        }
    }

    public static boolean writeData (String pathName, String data) throws IOException {
        try(FileWriter writer = new FileWriter(pathName,true)){
            writer.append(data);
            return true;
        }
    }
}
