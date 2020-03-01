package com.jiker.keju;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileOperator {
    public List readFile(String file) {
        String importPath="src/main/resources/"+file;
        FileReader fr = null;BufferedReader br = null;
        List<String> content = new ArrayList<String>();
        try{ fr = new FileReader(importPath);
            br = new BufferedReader(fr);String line;
            while((line=br.readLine())!=null){
                if(!line.trim().equals("")){content.add(line);} }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace(); }return  content;}
}
