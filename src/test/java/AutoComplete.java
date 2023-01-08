import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class AutoComplete {

    @Parameters("paramValue")
    @Test(groups = "autocomplete")
    public void autoComplete(@Optional  String paramValue) throws AWTException, InterruptedException {
        System.out.print("Test "+ paramValue);

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
        driver.findElement(By.xpath("//input")).sendKeys("AS");
        //List<WebElement> elementList = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
        Thread.sleep(4000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       /* Actions actions = new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();*/

    }
}
