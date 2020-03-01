package com.jiker.keju;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void readFile(){
        String file ="testData.txt";
        ReadFileOperator readFileOperator = new ReadFileOperator();
        try {
            assertNotNull(readFileOperator.readFile(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void calculateTest(){
        Calculate calculate = new Calculate();
        assertEquals(calculate.calculate("1����,�ȴ�0����"),"�շ�6Ԫ");
        assertEquals(calculate.calculate("3����,�ȴ�0����"),"�շ�7Ԫ");
        assertEquals(calculate.calculate("10����,�ȴ�0����"),"�շ�13Ԫ");
        assertEquals(calculate.calculate("2����,�ȴ�3����"),"�շ�7Ԫ");
    }

    @Test
    public void doCalculateTest(){
        Calculate calculate = new Calculate();
        assertNotNull(calculate.disCalculate(1));
    }

    @Test
    public void timeCalculateTest(){
        Calculate calculate = new Calculate();
        assertNotNull(calculate.timeCalculate(0));
    }

    @Test
    public void totalCaculateTest(){
        Calculate calculate = new Calculate();
        String [] arr= new String[6];
        arr[0]="1";
        arr[5]="2";
        assertNotNull(calculate.totalCaculate(arr));
    }

    @Test
    public void doReadFileTest(){
        ReadFileOperator readFileOperator = new ReadFileOperator();
        BufferedReader br=null;
        try {
            assertNull(readFileOperator.doReadFile(br));
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }

    }

}
