package passport;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Passport {

    private String number;

    private String name;

    private String surname;

    private String middleName;

    private LocalDate birthday;

    public Passport(String number, String name, String surname, String middleName, LocalDate birthday) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Паспорт номер: " + number + " ФИО: " + name + " "
                + surname + " " + middleName + ", дата рождения: " + birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return getNumber().equals(passport.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}