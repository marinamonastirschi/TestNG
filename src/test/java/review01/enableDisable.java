package review01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false)
    public void hello(){
        System.out.println("hellloo");
    }
    @Test
    public void funcA(){
        System.out.println((5+6));
    }
    @Test(dependsOnMethods = "funcA")
    public void funcB(){
        System.out.println("i am dependent on A");
    }
}
