import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    public static void readCSV(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String isim = values[0];
                String soyisim = values[1];
                String yas = values[2];
                String sinif = values[3];
                String ortalama = values[4];
                System.out.println("İsim : " + isim + ", Soyisim : " + soyisim + ", Yaş :" + yas
                +", Sınıfı :" + sinif +", Ortalaması :" + ortalama);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readCSV("Student.csv");
    }
}