import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ToolTip {

    @Test
    public void toolTip(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.globalsqa.com/demo-site/tooltip/");
        WebElement element = driver.findElement(By.xpath("img[contains(@src,'images/st')]"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        String s  = driver.findElement(By.xpath("img[contains(@src,'images/st')]//following::div[7]")).getText();
        System.out.print(s);

    }
}
