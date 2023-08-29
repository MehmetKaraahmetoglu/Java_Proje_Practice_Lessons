package day04_method_dateTime;

import java.time.LocalDateTime;

public class User {
    //1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
    String name="";
    LocalDateTime registerDate;

    public User() { // Parametresiz const olusturuldu.
    }

    public User(String name, LocalDateTime registerDate) { //Parametreli const olusturuldu
        this.name = name;
        this.registerDate = registerDate;
    }
}
