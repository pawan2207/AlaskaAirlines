package Hompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FlightSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.alaskaair.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("oneWay")).click();
        driver.findElement(By.id("fromCity1")).sendKeys("london");
        driver.findElement(By.xpath("//li[@title='London, United Kingdom (LCY-London City)']")).click();

    }
}
