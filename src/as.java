import java.util.Scanner;

public class as {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim ve karakter giriniz");
        String isim = scan.nextLine();
        char karakter = scan.next().charAt(0);
        int sayac = 0;
        int index = 0;
        while (index < isim.length()) {
            char k2 = isim.charAt(index);
            if (k2 == karakter) {
                sayac++;
            }
            index++;
        }
        System.out.println(isim);
        System.out.println("aranan karakter :" + karakter);
        System.out.println(sayac + " kere kullanılmıştır");
    }
}