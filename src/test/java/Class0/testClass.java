package Class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getTitle();
        driver.quit();
    }
}
