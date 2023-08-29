package day04_method_dateTime;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan=new Scanner(System.in);

    ArrayList<User> abc=new ArrayList<>();
    Registration obj =new Registration();

    void menu(){
        /*
        -kayit alma
        -sansli kullanici
        -kullanicilari listeleme
        -cikis
         */

        boolean cikis=true;

        do {
            System.out.println("1. Kayit\n"+"2. Kisi Listele\n"+"3. Sansli Kisiler\n"+"4. Cikis\n"+"SECIMINIZ: ");
            int secim =scan.nextInt();
            switch (secim){
                case 1:
                    abc=Registration.register();
                    //abc=kullanicilar


                    break;
                case 2:
                    obj.kullaniciListesi(abc);
                    break;
                case 3:
                    Registration.printHappyUsers(abc);
                    break;
                case 4:
                    cikis=false;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }
        }while(cikis);
    }
}
