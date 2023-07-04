package review01;

import class04.SoftAssertion;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    @Test
    public void hardAssertions(){
        // i am getting this information from the WebElement on a website
        String actualName="moazzam";
        String actualDesignation="softwareEngineer";

        Assert.assertEquals(actualName,"moazzam");
        System.out.println("hello i am here");
        Assert.assertEquals(actualDesignation,"softwareEngineer");
    }
    // no matter if your assertion fails, it will still continue to run
    @Test
    public void softAssert(){
        // i am getting this information from the WebElement on a website
        String actualName="moazzam";
        String actualDesignation="softwareEngineer";

        // declare the instance
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actualName,"moazzam");
        soft.assertEquals(actualDesignation,"softwareEngineer");
        soft.assertAll();
    }
}
