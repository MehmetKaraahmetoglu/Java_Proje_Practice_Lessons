import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi = 0;

        int ogrt_kimlik_no;
        while (true) {
            System.out.println("Lütfen 4 basmakli TC kimlik numaranizi giriniz: ");
            ogrt_kimlik_no = scanner.nextInt();

            ogrt_kimlik_no /= 10;
            basamakSayisi++;

            if (basamakSayisi == 4) {
                break;
            } else {
                System.out.println("Hatali giris lütfen tekrar deneyiniz: ");
            }

        }
        System.out.println(ogrt_kimlik_no);


    }

}


