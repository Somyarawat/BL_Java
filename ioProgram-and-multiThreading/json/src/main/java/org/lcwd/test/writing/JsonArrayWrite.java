package org.lcwd.test.writing;

import com.google.gson.JsonArray;

public class JsonArrayWrite {
    public static void main(String[] args) {
        JsonArray array = new JsonArray();
        array.add(101);
        array.add("Somya");
        System.out.println(array);
    }
}
