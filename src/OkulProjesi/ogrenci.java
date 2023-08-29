package OkulProjesi;

public class ogrenci {
    String ad;
    String soyad;
    String kimlikNo;
    int yas;
    int numara;
    String sinif;
    int siraNo;

    public ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci Sira No" + siraNo +
                ", Ad: " + ad +
                ", Soyad: " + soyad +
                ", KimlikNo: " + kimlikNo +
                ", Yas: " + yas +
                ", Numara: " + numara +
                ", Sinif: " + sinif;
    }

    public ogrenci(int siraNo,String ad, String soyad, String kimlikNo, int yas, int numara, String sinif) {
        this.siraNo=siraNo;
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }
}
