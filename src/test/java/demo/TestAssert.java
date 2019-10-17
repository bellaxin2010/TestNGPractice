package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestAssert {

    @Test
    public void TestAssert(){

        String[] num1={"a","b","c"};
        String[] num2={"a1","b1","c"};
        String[] num3=num1;

//        Assert.assertNotEquals(num1,num2," num 1 is not equal");

//        Assert.assertEqualsNoOrder(num1,num2, "数组串不相同");

//        Assert.assertEquals("Abc","xxx","not Equal");

        Assert.assertSame(num1, num3);
        Assert.assertTrue(num1==num2,"condition not same");
    }



    @Test
    public void testSoftAssert(){
        System.out.println("Test start");
        SoftAssert assertion=new SoftAssert();
        assertion.assertAll();
        assertion.assertEquals(12,13,"soft test not equal");
    }

}
