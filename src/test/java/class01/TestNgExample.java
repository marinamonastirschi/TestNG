package class01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgExample {
    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void OpenAndLaunchBrowser(){
        driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.close();
    }
    @Test(groups="smoke")
    public void verifyThatUserCanLogin(){
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
       WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
    }
    @Test
    public void verifyPasswordBoxIsThere(){
            WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
            System.out.println( password.isDisplayed());
    }
}
