package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions {
    public static  WebDriver driver;
   @BeforeMethod
    public void OpenBrowserAndLaunch(){
      driver=new ChromeDriver();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22%22");
               driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
   }
   @AfterMethod
    public void afterMethod(){
       driver.quit();
   }
   @Test
    public void VerifyTheErrorMessage(){
       WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
       userName.sendKeys("admin");
       WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
       logIn.click();
       WebElement text=driver.findElement(By.xpath("//span[@id='spanMessage']"));
       String actualErrorMsg=text.getText();
       String expectedErrorMsg="Password cannot be empty";
       Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
   }
}
