package homework3;

import homework3.exceptions.impl.IncorrectDateFormatException;
import homework3.exceptions.impl.IncorrectGenderFormatException;
import homework3.exceptions.impl.IncorrectPhoneNumberFormatException;
import homework3.exceptions.impl.PersonNameFormatException;

import java.time.LocalDate;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Person(String lastName, String firstName, String patronymic, String dateOfBirth, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(lastName + ' ' +
                firstName + ' ' +
                patronymic + ' ' +
                dateOfBirth + ' ' +
                phoneNumber + ' ' +
                gender + ' ' + "\n");
    }



}
