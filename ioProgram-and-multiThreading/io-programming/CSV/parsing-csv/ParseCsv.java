// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

class ParseCsv{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //try {
            //BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line = "101,Somya,21,Java";
            String[] data = line.split(",");
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            //while((line = br.readLine()) != null) {
        //         String[] value = line.split(",");
        //         for(String data : value){
        //             System.out.println(data);
        //         }
        //         System.out.println();
        //     }
        //     br.close();
        // } catch (IOException e) {
        // }
    }
}