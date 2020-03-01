package com.jiker.keju;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileOperator {
    public List readFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/" + file));
        ReadFileOperator readFileOperator = new ReadFileOperator();
        return readFileOperator.doReadFile(br);
    }

    public List doReadFile(BufferedReader br) throws IOException {
        String line;
        List<String> content = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            if (!line.trim().equals("")) {
                content.add(line);
            }
        }
        return content;
    }


}
