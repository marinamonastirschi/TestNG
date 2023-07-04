package review01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class annotation3 {
    @BeforeTest
    public void btest(){
        System.out.println("i am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("i am after test");
    }
}
