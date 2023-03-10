package _Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class _04_Example {

    @Test
    void loginTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement userName = driver.findElement(By.id("input-email"));
        userName.sendKeys("shalashsukayna@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("shalash123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        WebElement myAccountHeader = driver.findElement(By.xpath("(//div[@id='content']//h2)[1]"));

        Assert.assertEquals(myAccountHeader.getText(), "My Account");

        Thread.sleep(3000);
        driver.quit();
    }
}

