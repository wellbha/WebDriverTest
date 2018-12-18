import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestGoogle {
    @Test
    public void run() {
        //  public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriverTest\\src\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void run1() {
        //  public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriverTest\\src\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("What is my name?");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // driver.quit();

    }
}
