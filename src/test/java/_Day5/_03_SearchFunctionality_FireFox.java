package _Day5;

import Extends._Parameter_Driver_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunctionality_FireFox extends _Parameter_Driver_Class {


    @Test
    @Parameters(value = "searchKeyWord")
    void searchFunctionalityTest(String str) {
        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement element : resultList) {
            Assert.assertTrue(element.getText().toLowerCase().contains(str));
        }

    }
}
