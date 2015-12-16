package orangehrm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 16/12/2015.
 */
public class BaseTest {
    public static WebDriver driver;

    @Before
    public void setUp()
    {
        driver=new FirefoxDriver();
        driver.get("http://www.google.com/");
    }

    @Test
    public void searchContent()
    {
        driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
        driver.findElement(By.name("btnG")).click();
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
}
