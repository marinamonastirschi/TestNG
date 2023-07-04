package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.time.Duration;

public class HardAssertion extends CommonMethods {
    //    goto HRMS
//    enter username
//    enter wrong password
//    click on login
//    verify that the error message Invalid credentials is displayed
//    also confirm that the error message is Displayed


    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate() {
        openBrowserAndNavigateToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login", "chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
        driver.quit();
    }

    // test case1
    @Test(groups = "smoke")
    public void verifyTheErrorMessage() {
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
//       send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("abracadabra");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement errorMsg = driver.findElement(By.id("spanMessage"));
        String actualErrorMessage = errorMsg.getText();
        String expectedErrorMessage = "Invalid credentials";
        // comparing two strings
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);


        // check if it is displayed
        boolean errorMessageIsDisplayed = errorMsg.isDisplayed();
        Assert.assertTrue(errorMessageIsDisplayed);
    }


}
