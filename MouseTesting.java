package sampleapp.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseTesting {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\seleniumjar\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
        Actions actions=new Actions(driver);

        //closing login pop-up
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        Thread.sleep(1000);

        //find and move towards fashion div
        WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
        actions.moveToElement(fashion).build().perform();
        Thread.sleep(2000);

        //find and move towards home div
        WebElement home=driver.findElement(By.xpath("//div[text()='Home']"));
        actions.moveToElement(home).build().perform();
        Thread.sleep(2000);

        //find and move towards the appliance
        WebElement appliance=driver.findElement(By.xpath("//div[text()='Appliances']"));
        actions.moveToElement(appliance).build().perform();
        Thread.sleep(2000);

        driver.quit();



    }
}
