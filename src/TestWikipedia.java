import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestWikipedia {
    protected static WebDriver driver;
    static String expectedRegisterSuccessMessage = "Your registration completed";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\WebDriverTest\\src\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("FirstName1");
        driver.findElement(By.id("LastName")).sendKeys("Surname1");
        DateFormat dateFormat = new SimpleDateFormat("MMDDYYYHHMMSS");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        driver.findElement(By.id("Email")).sendKeys("firstautomation"+date1+"@test.com");
        driver.findElement(By.id("Password")).sendKeys("testing");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("testing");
        driver.findElement(By.id("register-button")).click();
        String actualRegisterSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Test case: registration scenario failed",expectedRegisterSuccessMessage,actualRegisterSuccessMessage);
        driver.findElement(By.linkText("Log out")).click();


        driver.quit();

    }

}
