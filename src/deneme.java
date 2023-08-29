import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class deneme {
    public static void main(String[] args) {
        Map<Integer, String> ogretmen = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int siraNo = 1;
        String ogretmenBilgisi;
        char secim;


        do {


            System.out.println("Lütfen ögretmenin AD ve SOYAD bilgisini giriniz: ");
            String ogrt_ad_soyad = scanner.next();

            System.out.println("Lütfen ögretmenin 4 haneli KIMLIK NO bilgisini giriniz: ");
            String ogrt_kimlik_no = scanner.next();


            System.out.println("Lütfen ögretmenin YAS bilgisini giriniz: ");
            String ogrt_yas = scanner.next();


            System.out.println("Lütfen ögretmenin BOLUM bilgisini giriniz: ");
            String ogrt_bolum = scanner.next();


            System.out.println("Lütfen ögretmenin 4 haneli SICIL NO bilgisini giriniz: ");
            String ogrt_sicil_no = scanner.next();
            ogretmenBilgisi = "Ogretmen Ad: " + ogrt_ad_soyad + ogrt_kimlik_no + ogrt_yas + ogrt_bolum + ogrt_sicil_no;

            ogretmen.put(siraNo, ogretmenBilgisi);
            siraNo++;

            System.out.println("Secim gir:");
            secim = scanner.next().charAt(0);
        } while ((secim != 'X'));


        System.out.println(ogretmen);
    }
}
