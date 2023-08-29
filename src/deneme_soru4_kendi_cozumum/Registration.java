package deneme_soru4_kendi_cozumum;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    /*
    2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
    ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
    return edin.

    3- Registration(Kayıt) classı na aynı zamanda kendine verilen
    ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
    yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
    */
    static ArrayList<User> kullanicilar = new ArrayList<>();// bu arratlistin içinde user tipinde veriler tutulacak

    static Scanner scan = new Scanner(System.in);

    static void register() {
        System.out.print("İsminizi giriniz: ");
        String name = scan.nextLine();
        LocalDateTime time = LocalDateTime.now();
        User kullanici = new User(name, time);// p'li cons. kullanarak user class ından obje oluşturduk
        kullanicilar.add(kullanici);
        // { {n,t} {n,t} {n,t} }
    }


    static void printHappyUsers() {
        for (User each : kullanicilar) {
            /*
            Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
             */
            if (each.registerDate.getSecond() <= 10) {
                System.out.println(each.name + " hadi iyisin 5 kilo balı kaptın....");
            } else {
                System.out.println(each.name + " bu sefer olmadı. Bi dahaki sefere....");
            }
        }
    }

    void kullaniciListesi() {
        for (User each:kullanicilar) {
            System.out.println("İsim: "+each.name+"  Kayıt zamanı: "+each.registerDate);
        }
    }
}
