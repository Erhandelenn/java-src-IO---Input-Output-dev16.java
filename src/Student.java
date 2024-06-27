import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String isim;
    private String soyisim;
    private int yas;
    private int sinif;
    private double ortalama;

    public Student(String isim, String soyisim, int yas, int sinif, double ortalama) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.sinif = sinif;
        this.ortalama = ortalama;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public int getYas() {
        return yas;
    }

    public int getSinif() {
        return sinif;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public String toCSV() {
        return isim + "," + soyisim + "," + yas + "," + sinif + "," + ortalama;
    }
}
