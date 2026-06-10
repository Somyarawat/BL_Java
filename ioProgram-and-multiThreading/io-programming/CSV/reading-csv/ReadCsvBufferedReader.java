
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadCsvBufferedReader{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                // String[] value = line.split(",");
                // for(String data : value){
                //     System.out.println(data);
                }
                //System.out.println();
            //}
            br.close();
        } catch (IOException e) {
        }
    }
}