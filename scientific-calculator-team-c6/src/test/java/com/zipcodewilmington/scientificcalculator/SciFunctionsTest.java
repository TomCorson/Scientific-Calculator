package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SciFunctionsTest {

    @Test
    public void sin() {
        Double num1 = 4.0;
        Double expectedResult = -0.7568024953079282;
        Double  actualResult = SciFunctions.sin(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void cos() {
        Double num1 = 98.8;
        Double expectedResult = -0.15948463910012836;
        Double  actualResult = SciFunctions.cos(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void tan() {
        Double num1 = 80.8;
        Double expectedResult = -1.2131408045265912;
        Double  actualResult = SciFunctions.tan(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void sec() {
        Double num1 = 98.8;
        Double expectedResult =-6.270196337668454;
        Double  actualResult = SciFunctions.sec(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void csc() {
        Double num1 = 98.8;
        Double expectedResult = -1.0129655434416642;
        Double  actualResult = SciFunctions.csc(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void cot() {
        Double num1 = 98.8;
        Double expectedResult = 0.16155244411665923;
        Double  actualResult = SciFunctions.cot(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void log() {
        Double num1 = 98.8;
        Double expectedResult = 1.994756944587628 ;
        Double  actualResult = SciFunctions.log(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void inverseLog() {
        Double num1 = 98.8;
        Double expectedResult = 7.350416252303545 ;
        Double  actualResult = SciFunctions.inverseLog(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void naturalLog() {
        Double num1 = 98.8;
        Double expectedResult = 4.593097604753822;
        Double  actualResult = SciFunctions.naturalLog(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void inverseNaturalLog() {
        Double num1 = 98.8;
        Double expectedResult = 98.80000000000003 ;
        Double  actualResult = SciFunctions.inverseNaturalLog(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void binary() {
        Integer num1 = 64;
        String expectedResult = "1000000" ;
        String  actualResult = SciFunctions.binary(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void octal() {
        Integer num1 = 64;
        String expectedResult = "100" ;
        String  actualResult = SciFunctions.octal(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void decimal() {
        Integer num1 = 64;
        String expectedResult = "64" ;
        String actualResult = SciFunctions.decimal(num1);
       assertEquals(expectedResult, actualResult);
   }
   @Test
    public void hexadecimal() {
        Integer num1 = 64;
        String expectedResult = "40" ;
        String  actualResult = SciFunctions.hexadecimal(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void radians() {
        Double num1 = 64.0;
        Double expectedResult = 1.117010721276371 ;
        Double  actualResult = SciFunctions.radians(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void degrees() {
        Double num1 = 64.0;
        Double expectedResult = 3666.9298888372687 ;
        Double  actualResult = SciFunctions.degrees(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiplyByPi() {
        Double num1 = 3.0;
        Double expectedResult = 9.424777800000001;
        Double  actualResult = SciFunctions.multiplyByPi(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void factorial() {
        Double num1 = 4.0;
        Double expectedResult = 24.0;
        Double  actualResult = SciFunctions.factorial(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void celToFar(){
        Double num1 = 3.0;
        Double expectedResult = 37.4 ;
        Double  actualResult = SciFunctions.celToFar(num1);
        assertEquals(expectedResult, actualResult);
    }



}