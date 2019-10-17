package demo;

import org.testng.annotations.*;

public class TestExample {


    @BeforeClass
    public void setUp() {
        System.out.println("setup ...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println(" after  Class");
    }

    @BeforeSuite
    public void testSuite() {

        System.out.println("testsuite");
    }

    @Test(groups = {"fast"},priority =2)
    public void aFastTest() {

        System.out.println("Fast test...");
    }

    @Test(groups = {"slow"},enabled = false)
    public void aSlowTest() {
        System.out.println("slow test ./..");
    }


    @Test(enabled = false)
    @Parameters({"Browser","Server"})
    public void testSingleString(String browser, String server) {
        System.out.println("testString " + browser+" server is "+ server);
    }


    @Test(expectedExceptions=ArithmeticException.class,enabled = false)
    public void divisionException(){
        int i =1 / 2;
        System.out.println(" result should send error  "+i);
    }
}




