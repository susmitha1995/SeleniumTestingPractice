import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

@Listeners(ListenersExample.class)
public class LaunchBrowser {

    WebDriver driver;



    @BeforeSuite
    public void startApp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @Test
    public void launchBrowser(){

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        PageFactory.initElements(driver,LoginPageObjects.class);
        LoginPageObjects.username.sendKeys("Admin");
        LoginPageObjects.password.sendKeys("admin");
    }

    @Test
    public void links(){

        driver.get("https://demoqa.com/profile");
       WebElement login =  driver.findElement(By.xpath("//a[@href='/login']"));
       clickOn(driver,login,Duration.ofSeconds(10));

       WebElement username = driver.findElement(By.id("userName"));
       sendKeys(driver,username,Duration.ofSeconds(10),"susmitha");

    }
   public void  clickOn(WebDriver driver, WebElement element, Duration timeOut)
    {
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void sendKeys(WebDriver driver,WebElement element,Duration timeOut, String sendKey){

        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).sendKeys(sendKey);

    }



}
