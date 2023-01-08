import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class Selectable {

    @Test
    public void selectable() throws AWTException {
        ////ol[@id='selectable']//li

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.globalsqa.com/demoSite/practice/selectable/serialize.html");

        List<WebElement> elementList = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
        //elementList.get(0).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(elementList.get(0)).click(elementList.get(1)).build().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        for(int i=0;i<elementList.size();i++){
            elementList.get(i).click();
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
        }


    }


