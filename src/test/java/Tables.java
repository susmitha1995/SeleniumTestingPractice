import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tables {

    @Test
    public void tables(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/table.xhtml");
        List<WebElement> tableColumns = driver.findElements(By.tagName("th"));
        System.out.print(tableColumns.size());
        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
        System.out.print(tableRows.size());


    }
}
