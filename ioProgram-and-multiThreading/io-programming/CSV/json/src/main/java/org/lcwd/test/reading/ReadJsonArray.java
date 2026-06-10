package org.lcwd.test.reading;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class ReadJsonArray {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String[] skills = gson.fromJson(new FileReader("skills.json"),String[].class);
        for(String skill:skills){
            System.out.println(skill);
        }
    }
}
