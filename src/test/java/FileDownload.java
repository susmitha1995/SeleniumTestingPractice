import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@Listeners(ListenersExample.class)
public class FileDownload {

    @Test
    public void fileDownload() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//a[text()='Download']")).click();
        File file = new File("C:\\Users\\ssant\\Downloads");
        Thread.sleep(4000);
        File[] files= file.listFiles();
        //Arrays.stream(files).filter(s->s.getName().equals("samplefile")).forEach(s->System.out.print("File is present"));
        for(File f:files){
            if(f.getName().equals("samplefile")){
                System.out.print("File is present");
                break;
            }
        }
    }
}
