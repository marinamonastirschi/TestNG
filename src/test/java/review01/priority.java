package review01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 3)
    public void A(){
        System.out.println("hello A");
    }
    @Test(priority = 0)
    public void B(){
        System.out.println("hello B");
    }
    @Test(priority = 1)
    public void C(){
        System.out.println("hello C");
    }
    @Test(priority = 2)
    public void D(){
        System.out.println("hello D");
    }
}
