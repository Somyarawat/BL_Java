package org.lcwd.test.reading;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

class Students{
    int id;
    String name;
}

public class ReadStudentArray {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Students[] students = gson.fromJson(new FileReader("students.json"),Students[].class);
        for(Students s : students){
            System.out.println(s.id);
            System.out.println(s.name);
        }
    }
}
