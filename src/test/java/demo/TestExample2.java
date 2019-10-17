package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExample2 {


    @BeforeClass
    public void setUp() {
        System.out.println("setup ...");
    }

    @BeforeSuite
    public void testSuite() {
        System.out.println("testsuite");
    }

    @Test(dependsOnMethods = {"test2","test3"})
    public void test1(){
        System.out.println(" test 1");
    }


    @Test
    public void test2(){
        System.out.println(" test 2 ");
    }

    @Test
    public void test3(){
        System.out.println("test 3 ");
    }
}




