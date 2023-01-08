import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragAndDrop {

    @Test
    public void dragAndDrop(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/drag.xhtml");
        /*WebElement dragElement  = driver.findElement(By.id("form:drag_content"));
        WebElement dropElement  = driver.findElement(By.id("form:drop_content"));
        Actions actions  = new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).build().perform();*/

        /*WebElement dragElement = driver.findElement(By.xpath("//*[text()='Bamboo Watch']"));
        WebElement dropElement  =driver.findElement(By.xpath("//*[text()='Bracelet']"));
        Actions actions  = new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).build().perform();*/

        WebElement element = driver.findElement(By.xpath("//*[@id='form:j_idt125']//span"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element,70,80);
    }
}
