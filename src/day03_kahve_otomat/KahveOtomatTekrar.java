package day03_kahve_otomat;

import java.util.Scanner;

public class KahveOtomatTekrar {
    /*
   Basit bir Kahve makinesi oluşturun.
1. Şart
3 çeşit kahvemiz olsun.
 Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
 Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
  Örn:
 Hangi Kahveyi İstersiniz?
 1.Türk kahvesi
 2.Filtre Kahve
 3.Espresso
2.Şart
 Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
3. Şart
 Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
 sorusunu sorsun.
4. Şart
 Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
 sorusunu sorsun.
Sonuç
  Siparişlerimizi verdik. Son hali görmek istiyoruz.
                   konsola şunu yazdırın örnek :
       Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
    */
    static String kahveSecimi = "", sut = "", seker = "", bardakBoyutu = "";
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("********KAHVEMIZE HOSGELDINIZ");
        do {
            System.out.print("*********MENU*******\n" +
                    "Türk Kahvesi\n" +
                    "Filtre Kahve\n" +
                    "Americano\n" +
                    "SECIM:");
            kahveSecimi = scanner.nextLine();
            if (!kahveSecimi.equalsIgnoreCase("türk kahvesi") &&
                    !kahveSecimi.equalsIgnoreCase("filtre kahve") &&
                    !kahveSecimi.equalsIgnoreCase("americano"))
                System.out.println("yanlis secim yaptiniz");


        } while (!kahveSecimi.equalsIgnoreCase("Türk Kahvesi") &&
                !kahveSecimi.equalsIgnoreCase("Filtre Kahve") &&
                !kahveSecimi.equalsIgnoreCase("Americano"));
    }

    //Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
    static void sutEkleme() {
        do {
            System.out.println("Süt eklemek istemisiniz?(Evet veya Hayır)");
            sut = scanner.next();
            if (!sut.equalsIgnoreCase("Evet") && (!sut.equalsIgnoreCase("hayir"))) {
                System.out.println("tekrar giris yapiniz");
            } else if (sut.equalsIgnoreCase("evet")) {
                System.out.println("süt ekleniyor");
            } else {
                System.out.println("süt eklenmiyor");
            }

        } while (!sut.equalsIgnoreCase("Evet") && (!sut.equalsIgnoreCase("hayir")));


    }

    //Şart
    //  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
    //  sorusunu sorsun.
    static void sekerEkleme() {

        do {
            System.out.println("Şeker ister misiniz ? (Evet veya hayır)");
            seker = scanner.next();
            if (!seker.equalsIgnoreCase("Evet") && !seker.equalsIgnoreCase("hayir")) {
                System.out.println("tekrar giris yapiniz");
            } else if (seker.equalsIgnoreCase("evet")) {
                System.out.println("seker ekleniyor");
            } else {
                System.out.println("seker eklenmiyor");
            }

        } while (!seker.equalsIgnoreCase("Evet") && !seker.equalsIgnoreCase("hayir"));

    }

    // Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
    //  sorusunu sorsun.
    static void kahveBoyutu() {
        scanner.nextLine();
        do {
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy)");

            bardakBoyutu = scanner.nextLine();

            if (!bardakBoyutu.equalsIgnoreCase("büyük boy") &&
                    !bardakBoyutu.equalsIgnoreCase("orta boy") &&
                    !bardakBoyutu.equalsIgnoreCase("kücük boy"))
                System.out.println("hatali giris yaptiniz:");

        } while (!bardakBoyutu.equalsIgnoreCase("büyük boy") &&
                !bardakBoyutu.equalsIgnoreCase("orta boy") &&
                !bardakBoyutu.equalsIgnoreCase("kücük boy"));
    }

    //Siparişlerimizi verdik. Son hali görmek istiyoruz.
    //                    konsola şunu yazdırın örnek :
    //        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
    static void sonuc() {
        if (sut.equalsIgnoreCase("evet")) {
            sut = "sütlü";
        } else {
            sut = "sütsüz";
        }
        if (seker.equalsIgnoreCase("evet")) {
            seker = "sekerli";
        } else {
            seker = "sekersiz";
        }
        System.out.print(kahveSecimi + " " + sut + " " + seker + " " + bardakBoyutu + " hazırdır. Afiyet olsun !!!");
    }

    public static void main(String[] args) {
        menu();
        sutEkleme();
        sekerEkleme();
        kahveBoyutu();
        sonuc();
    }

}
