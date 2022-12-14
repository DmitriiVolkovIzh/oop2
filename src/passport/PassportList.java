package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PassportList {

    private Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void add(Passport passport) {
        Passport old = get(passport.getNumber());
        if (old!=null){
            passports.remove(old);
        }
        passports.add(passport);
    }

    public Passport get(String number) {
        for (Passport passport:passports){
            if(passport.getNumber().equals(number)){
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }

    public static void main(String[] args) {
        Set<Passport> passports1 =new HashSet<>();
        passports1.add(new Passport("945624","Дмитрий","Волков","Петрович", LocalDate.ofEpochDay(1991-8-12)));
        passports1.add(new Passport("945624","Дмитрий","Волков","Петрович", LocalDate.ofEpochDay(1991-8-12)));
        PassportList passportList = new PassportList(passports1);
        System.out.println(passportList);
    }
}


