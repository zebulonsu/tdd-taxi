package com.jiker.keju;

public class Calculate {
    public String calculate(String readAnswer) {
        String[] arr = this.readArgs(readAnswer);
        int intReturn=0;
        intReturn=this.totalCaculate(arr);
        return "收费" + intReturn + "元";
    }

    public double disCalculate(int distance) {
        if (distance > 2 && distance <= 8) {
            return 6 + (0.8 * (distance - 2));
        } else if (distance > 8) {
            return 6 + (0.8 * (distance - 2)) + (0.4 * (distance - 8));
        }
        return 6;
    }

    public double timeCalculate(int time) {
        double timeReturn = 0.25 * time;
        return timeReturn;
    }

    public String[] readArgs(String readAnswer) {
        String[] arr = readAnswer.split("\\D");
        return arr;
    }

    public int totalCaculate(String[] arr){
        int intReturn = 0;
        if (arr[0] != "" && arr[5] != "") {
            double disReturn = this.disCalculate(Integer.parseInt(arr[0]));
            double timeReturn = this.timeCalculate(Integer.parseInt((arr[5] == "" ? "0" : arr[5])));
            double totalReturn = disReturn + timeReturn;
            intReturn = new Double(Math.rint(totalReturn)).intValue();
        }
        return intReturn;
    }
}
