package class01;

import org.testng.annotations.Test;

public class EnableDisable {
    @Test(enabled=false)
    public void ATest(){
        System.out.println("i am a test A");
    }
    @Test
    public void BTest(){
        System.out.println("i am test B");
    }
    @Test(enabled=false)
    public void CTest(){
        System.out.println("I am test C");
    }
}
