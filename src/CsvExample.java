import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvExample {

    public static void writeCSV(String fileName, List<Student> students) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : students) {
                writer.write(student.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Erhan", "Delen", 25, 4, 3.9));
        students.add(new Student("Ali", "Kara", 29, 1, 3.0));
        students.add(new Student("Yiğit", "Yeniay", 19, 1, 2.8));
        students.add(new Student("Fatma", "Demir", 18, 1, 2.6));
        students.add(new Student("Ayşe", "Koç", 25, 4, 3.4));
        students.add(new Student("Emine", "Kara", 28, 3, 3.5));
        students.add(new Student("Batu", "Mavi", 19, 1, 3.7));
        students.add(new Student("Melek", "Güler", 19, 1, 3.8));
        students.add(new Student("Yekta", "Karatay", 21, 3, 2.6));
        students.add(new Student("Zeynep", "Güzel", 22, 4, 2.4));

        writeCSV("Student.csv", students);
    }
}