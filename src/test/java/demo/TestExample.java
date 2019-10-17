package demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestExample {

    @Test(groups = {"server"})
    public void restartServer(){
        System.out.println("restart ...");
        Assert.assertEquals(1,3,"not equal");
    }

    @Test(groups = {"app"})
    public void startApp(){
        System.out.println("start app ...");
    }

    @Test(dependsOnGroups = {"app"})
    public void serverIsDown(){
        System.out.println("server is down");
    }

    @Test(dependsOnGroups = {"app"})
    public void serverIsUp(){
        System.out.println("server is up");
    }


    @Test(dependsOnGroups = {"server"},alwaysRun = true)
    public void startServer(){
        System.out.println("start");
    }
}




