package com.jiker.keju;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        AppRunner appRunner = new AppRunner();
        List<String> answer = appRunner.readAnswer(args[0]);
        for (String item : answer) {
            Calculate calculate = new Calculate();
            String receipt = calculate.calculate(item);
            System.out.println(receipt);
        }
    }

    public static List readAnswer(String testDataFile) {
        ReadFileOperator readFileOperator = new ReadFileOperator();
        List<String> answer = new ArrayList<String>();
        try {
            answer = readFileOperator.readFile(testDataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
