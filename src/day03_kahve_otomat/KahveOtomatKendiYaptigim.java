package day03_kahve_otomat;

import java.util.Scanner;

public class KahveOtomatKendiYaptigim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Mehmetbucks'a hosgeldiniz!\nHangi kahveyi istersiniz? ");
        System.out.println("Kahve numarasini secip enter'a basiniz...");
        System.out.println("1- Türk Kahvesi\n2- Filtre Kahve\n3- Americano\n4- Cikis");

        int secim = scanner.nextInt();

        do {
            if (secim==4){
                System.out.println("Cikis yapiliyor");
                System.exit(0);
            }
            if (!(secim == 1 || secim == 2 || secim == 3)) {
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
                secim = scanner.nextInt();
            }
            char secimSut;
            if (secim == 1) {

                System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                secimSut = scanner.next().toUpperCase().charAt(0);

                if (!(secimSut == 'E' || secimSut == 'H')) {
                    System.out.println("Hatali giris yaptiniz, Lütfen süt bilgisini tekrar giriniz...");
                    secimSut = scanner.next().toUpperCase().charAt(0);
                }

                if (secimSut == 'E') {

                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }

                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                    }

                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütlü Türk kahvesi hazirdir.\nAfiyet olsun!");
                    }
                }
                if (secimSut == 'H') {
                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");
                    }

                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }

                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütsüz Türk kahvesi hazirdir.\nAfiyet olsun!");

                    }

                }
            }

            if (secim == 2) {
                System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                secimSut = scanner.next().toUpperCase().charAt(0);

                if (!(secimSut == 'E' || secimSut == 'H')) {
                    System.out.println("Hatali giris yaptiniz, Lütfen süt bilgisini tekrar giriniz...");
                    secimSut = scanner.next().toUpperCase().charAt(0);
                }

                if (secimSut == 'E') {

                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }


                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                    }
                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }


                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütlü Filtre Kahve hazirdir.\nAfiyet olsun!");

                    }


                }
                if (secimSut == 'H') {
                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }

                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                    }
                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }

                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütsüz Filtre Kahve hazirdir.\nAfiyet olsun!");

                    }
                }
            }

            if (secim == 3) {

                System.out.println("Süt eklemek istermisiniz? E= Evet  H= Hayir  ");
                secimSut = scanner.next().toUpperCase().charAt(0);

                if (!(secimSut == 'E' || secimSut == 'H')) {
                    System.out.println("Hatali giris yaptiniz, Lütfen süt bilgisini tekrar giriniz...");
                    secimSut = scanner.next().toUpperCase().charAt(0);
                }

                if (secimSut == 'E') {

                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);
                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütlü Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütlü Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütlü Americano hazirdir.\nAfiyet olsun!");

                    }
                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);

                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütlü Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütlü Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütlü Americano hazirdir.\nAfiyet olsun!");

                    }
                }
                if (secimSut == 'H') {
                    char secimSeker;

                    System.out.println("Seker eklemek istermisiniz?  E= Evet  H= Hayir");
                    secimSeker = scanner.next().toUpperCase().charAt(0);

                    if (!(secimSeker == 'E' || secimSeker == 'H')) {
                        System.out.println("Hatali giris yaptiniz, Lütfen seker bilgisini tekrar giriniz...");
                        secimSeker = scanner.next().toUpperCase().charAt(0);
                    }

                    if (secimSeker == 'E') {
                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);

                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekerli, sütsüz Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekerli, sütsüz Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekerli, sütsüz Americano hazirdir.\nAfiyet olsun!");

                    }
                    if (secimSeker == 'H') {

                        char secimBoyut;
                        System.out.println("Hangi boyutta olsun?\nB= Buyuk  O= Orta  K= Kucuk");
                        secimBoyut = scanner.next().toUpperCase().charAt(0);

                        if (!(secimBoyut == 'B' || secimBoyut == 'O' || secimBoyut == 'K')) {
                            System.out.println("Hatali giris yaptiniz, Lütfen boyut bilgisini tekrar giriniz...");
                            secimBoyut = scanner.next().toUpperCase().charAt(0);

                        }
                        if (secimBoyut == 'B')
                            System.out.println("Büyük boy, sekersiz, sütsüz Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'O')
                            System.out.println("Orta boy, sekersiz, sütsüz Americano hazirdir.\nAfiyet olsun!");

                        if (secimBoyut == 'K')
                            System.out.println("Kucuk boy, sekersiz, sütsüz Americano hazirdir.\nAfiyet olsun!");

                    }
                }
            }
        } while (!(secim == 1 || secim == 2 || secim == 3));
    }
}



