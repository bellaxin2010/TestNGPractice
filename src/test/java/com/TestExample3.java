package com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestExample3 {


    @BeforeClass
    public void setUp() {
        System.out.println("setup ...");
    }

    @BeforeSuite
    public void testSuite() {
        System.out.println("testsuite");
    }

    @Test(groups = {"API TEST"})
    public void aFastTest() {
        System.out.println("Fast test...");
    }

    @Test(groups = {"API TEST"})
    public void aSlowTest() {
        System.out.println("slow test ./..");
    }

    @Parameters({"value"})
    @Test
    public void testSingleString(String value) {
        System.out.println("testString " + value);
        assert "bell".equals(value);
    }


    @Test(expectedExceptions=ArithmeticException.class)
    public void divisionException(){
        int i =1 / 0;
        System.out.println(" result should send error  "+i);
    }
}




