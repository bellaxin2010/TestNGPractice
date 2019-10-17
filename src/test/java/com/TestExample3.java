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

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test...");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("slow test ./..");
    }

    @Parameters({"name"})
    @Test
    public void testSingleString(String name) {
        System.out.println("testString " + name);
        assert "bell".equals(name);
    }


    @Test(expectedExceptions=ArithmeticException.class)
    public void divisionException(){
        int i =1 / 0;
        System.out.println(" result should send error  "+i);
    }
}




