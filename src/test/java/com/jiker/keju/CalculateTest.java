package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculateTest {
    @Test
    public void readFile(){
        String file ="D:\\project\\taxi\\src\\main\\resources\\testData.txt";
        ReadFileOperator readFileOperator = new ReadFileOperator();
        assertNotNull(readFileOperator.readFile(file));
    }
    @Test
    public void calculateTest(){
        Calculate calculate = new Calculate();
        assertEquals(calculate.calculate("1公里,等待0分钟\n"),"收费6元"+"\n");
        assertEquals(calculate.calculate("3公里,等待0分钟\n"),"收费7元"+"\n");
        assertEquals(calculate.calculate("10公里,等待0分钟\n"),"收费13元"+"\n");
        assertEquals(calculate.calculate("2公里,等待3分钟\n"),"收费7元"+"\n");
    }
}
