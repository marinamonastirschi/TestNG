package review01;

import org.testng.annotations.*;

public class Annotation {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class");
    }
    @Test
    public void testA(){
        System.out.println("i am test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("i am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("i am after method");
    }
    @Test
    public void testB(){
        System.out.println("i am test B");
    }

}
