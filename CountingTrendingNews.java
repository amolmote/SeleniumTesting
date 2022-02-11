package sampleapp.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountingTrendingNews {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\seleniumjar\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://in.search.yahoo.com/?fr2=inr");
        Thread.sleep(2000);

        List<WebElement> list=driver.findElements(By.xpath("//li[@class='icon-find']"));

        System.out.println("total number of latest news "+list.size());
    }
}
