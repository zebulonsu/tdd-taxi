package com.jiker.keju;

public class Calculate {
    public String calculate(String readAnswer){
        String[] arr=this.readArgs(readAnswer);
        double disReturn =this.disCalculate(Integer.parseInt(arr[0]));
        double timeReturn = this.timeCalculate(Integer.parseInt(arr[5]));
        double totalReturn = disReturn+timeReturn;
        int intReturn = new Double(Math.rint(totalReturn)).intValue();
        String stringReturn = "收费"+intReturn+"元"+"\n";
        return stringReturn;
    }
    private double disCalculate(int distance){
        double disReturn=0l;
        if(distance<=2){
            disReturn=6;
        } else if(distance>2&&distance<=8){
            disReturn=6+(0.8*(distance-2));
        } else if(distance>8){
            disReturn=6+(0.8*(distance-2))+(0.4*(distance-8));
        }return disReturn;
    }
    private double timeCalculate(int time){
       double timeReturn = 0.25*time;
       return timeReturn;
    }
    private String[] readArgs(String readAnswer){
        String[] arr=readAnswer.split("\\D");
        return arr;
    }
}
