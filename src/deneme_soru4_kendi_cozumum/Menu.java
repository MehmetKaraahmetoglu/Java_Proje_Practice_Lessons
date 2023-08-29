package deneme_soru4_kendi_cozumum;


import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    Registration registration = new Registration();

    void menu() {
        /*
        -kayıt alma
        -şanslı kullanıcı
        -kullanıcıları listeleme
        -çıkış
         */
        boolean cikis = true;
        do {
            System.out.print("1. Kayıt İşlemi\n" +
                    "2. Kişi Listele\n" +
                    "3. Şanslı Kişiler\n" +
                    "4. Çıkış\n" +
                    "SEÇİMİZ: ");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    Registration.register();
                    break;
                case 2:
                    registration.kullaniciListesi();
                    break;
                case 3:
                    Registration.printHappyUsers();
                    break;
                case 4:
                    cikis = false;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız....");
                    break;
            }

        } while (cikis);
    }
}
