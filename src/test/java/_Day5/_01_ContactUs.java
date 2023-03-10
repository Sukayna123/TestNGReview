package _Day5;

import Extends._Driver_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Extends._Driver_Class.driver;

public class _01_ContactUs extends _Driver_Class {
    @Test
    @Parameters({"message1"}) // this name must be the same with the name in the xml file
    void contactUs(String message1) throws InterruptedException {
        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput = driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys(message1);
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }

    @Test
    @Parameters({"message1","message2"}) // this name must be the same with the name in the xml file
    void contactUs1(String message1, String message2) throws InterruptedException {
        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput = driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys(message1);
        messageInput.sendKeys(message2);

        Thread.sleep(3000);

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
