package demo;

import org.testng.annotations.Test;

public class TestTimeout {

    @Test(invocationCount = 3,invocationTimeOut = 6000) // 1. 可循环几次 2. 耗时
    public void loginoutTest() throws InterruptedException{

        Thread.sleep(2000);
        System.out.println("login out test");
    }


    @Test(timeOut = 3000)
    public void loginTest(){
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

}
