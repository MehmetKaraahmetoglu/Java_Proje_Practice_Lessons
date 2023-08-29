package OkulProjesi;

import java.util.Scanner;

public class Menu_Runner extends OkulKayit {
    //2.  Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
    //    aşağıdaki gibi bir menü gösterilsin.
    //    ====================================
    //     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
    //    ====================================
    //     1- ÖĞRENCİ İŞLEMLERİ
    //     2- ÖĞRETMEN İŞLEMLERİ
    //     Q- ÇIKIŞ
    void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     Q- ÇIKIŞ");
        char secim = scanner.next().toUpperCase().charAt(0);


        switch (secim) {
            case '1':
                ogrAltMenu();
            case '2':
                ogrtAltMenu();
            case 'Q':
                System.exit(0);
            default:
                System.out.println("Hatali secim yaptiniz");
        }

        //3.  Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
        //    ============= İŞLEMLER =============
        //         1-EKLEME
        //         2-ARAMA
        //         3-LİSTELEME
        //         4-SİLME
        //         Q-ÇIKIŞ
        //    SEÇİMİNİZ:

    }

    private void ogrAltMenu() {
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         Q-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");

        Scanner scanner = new Scanner(System.in);

        char secim = scanner.next().toUpperCase().charAt(0);


        switch (secim) {
            case '1':
                ogr_ekleme();
                menu();
                break;
            case '2':
                ogrArama();
                menu();
                break;
            case '3':
                ogrListele();
                menu();
                break;
            case '4':
                ogrSilme();
                menu();
                break;
            case 'Q':
                menu();
                break;
            default:
                System.out.println("Hatali secim yaptiniz");


        }
    }

    void ogrtAltMenu() {

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         Q-ÇIKIŞ\n" +
                "    SEÇİMİNİZ:");

        Scanner scanner = new Scanner(System.in);

        char secim = scanner.next().toUpperCase().charAt(0);


        switch (secim) {
            case '1':
                ogrt_ekleme();
                menu();
                break;
            case '2':
                ogrtArama();
                menu();
                break;
            case '3':
                ogrtListele();
                menu();
                break;
            case '4':
                ogrtSilme();
                menu();
                break;
            case 'Q':
                menu();
                break;
            default:
                System.out.println("Hatali secim yaptiniz");


        }
    }

    public static void main(String[] args) {
        Menu_Runner menu = new Menu_Runner();
        menu.menu();

    }
}
