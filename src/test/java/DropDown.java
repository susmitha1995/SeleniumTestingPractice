import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(ListenersExample.class)
public class DropDown {

    @Test
    public void dropDown(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.leafground.com/select.xhtml");
        Select select = new Select(driver.findElement(By.className("ui-selectonemenu")));
        select.selectByIndex(1);
        Assert.assertEquals(true,false);

    }
}
