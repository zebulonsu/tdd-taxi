package com.jiker.keju;

import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        String testDataFile = args[0];
        ReadFileOperator readFileOperator = new ReadFileOperator();
        List<String> answer=readFileOperator.readFile(testDataFile);
        for(String item:answer){
            Calculate calculate = new Calculate();
            String receipt=calculate.calculate(item);
            System.out.println(receipt);}
    }
}
