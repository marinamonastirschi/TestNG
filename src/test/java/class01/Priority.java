package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority=4, groups="smoke")
    public void ATest() {
        System.out.println("i am a test A");
    }

    @Test(priority=3)
    public void BTest() {
        System.out.println("i am test B");
    }

    @Test(priority=2)
    public void CTest() {
        System.out.println("i am test C");
    }
// no priority means highest priority
    @Test()
    public void ABTest() {

        System.out.println("i am test D");
    }
}
