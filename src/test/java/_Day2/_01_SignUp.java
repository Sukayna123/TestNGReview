package _Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SignUp {
    @Test
    void signUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccount.click();

        WebElement register = driver.findElement(By.xpath("(//*[@id=\"top-links\"]//a)[3]"));
        register.click();

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("sam");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Sam");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("samsam@gmail.com");

        WebElement telephone = driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("4445559999");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("sam1234");

        WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
        passwordConfirm.sendKeys("sam1234");

        WebElement checkBox = driver.findElement(By.name("agree"));
        checkBox.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='content']//p"));

        Assert.assertEquals(successMessage.getText(), "Congratulations! Your new account has been successfully created!", "Your test is not passed");
        Thread.sleep(3000);
        driver.quit();
    }

}
