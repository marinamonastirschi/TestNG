package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;


public class SoftAssertion extends CommonMethods {
    // precondition

    // login into the syntax HRMS app
    // verify the dashboard is displayed
    // verify the message is Welcome Admin


    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate() {
        openBrowserAndNavigateToURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login","chrome");
    }

    // post condition
    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
        driver.quit();
    }

    @Test(groups = "regression")
    public void verifyTheWelcomeMessage() {
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
//       send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        // get the message
        WebElement welcomeMsg = driver.findElement(By.id("welcome"));
        String welcomeTxt = welcomeMsg.getText();
        boolean isDisplayed = welcomeMsg.isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(isDisplayed);


        // verify the message is Welcome Admin
        String actualWelcomeText= welcomeMsg.getText();
        String expectedWelcomeText="Welcome Admin";
        soft.assertEquals(actualWelcomeText,expectedWelcomeText);
        soft.assertAll();

    }
}
