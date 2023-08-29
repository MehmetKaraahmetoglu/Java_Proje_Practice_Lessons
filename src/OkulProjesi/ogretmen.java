package OkulProjesi;

public class ogretmen {
    String ad;
    String soyad;
    String kimlikNo;
    int yas;
    String bolum;
    int sicilNo;
    int siraNo;

    public ogretmen() {
    }

    @Override
    public String toString() {
        return "Ogretmen Sira No" + siraNo +
                ", Ad: " + ad +
                ", Soyad: " + soyad +
                ", KimlikNo: " + kimlikNo +
                ", Yas: " + yas +
                ", Bolum: " + bolum +
                ", SicilNo: " + sicilNo;
    }

    public ogretmen(int siraNo, String ad, String soyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        this.siraNo = siraNo;
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
}
