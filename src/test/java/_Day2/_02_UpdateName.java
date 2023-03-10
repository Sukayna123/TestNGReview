package _Day2;

import Extends._Driver_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _02_UpdateName extends _Driver_Class {

    void editNameTest(){
        editName("TestNG3");
        editName("TestNG");
    }

    public void editName(String name) {


        WebElement editAccount = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editAccount.click();

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys(name);

        WebElement continueButton = driver.findElement(By.cssSelector("input[type='submit']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[class=\"alert alert-success alert-dismissible\"]"));
        Assert.assertEquals(successMessage.getText(),"Success: Your account has been successfully updated.");

    }
}

