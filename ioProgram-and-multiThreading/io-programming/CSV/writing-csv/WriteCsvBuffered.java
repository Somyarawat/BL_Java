
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteCsvBuffered{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));
            bw.write("ID,Name,Age,Course\n");
            bw.write("101,Somya,21,Java\n");
            bw.write("102,Kartikey,22,Python\n");
            bw.write("103,Harshita,22,React");
            bw.close();
            System.out.println("Csv Written");
        } catch (IOException e) {
        }
    }
}