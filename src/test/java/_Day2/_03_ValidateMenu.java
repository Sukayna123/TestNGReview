package _Day2;

import Extends._Driver_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _03_ValidateMenu extends _Driver_Class {

    @Test(groups = "SmokeTest")
    void ValidateMenuTest() {
        List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class=\"nav navbar-nav\"]/li"));
        List<String> expectedMenuList = new ArrayList<>(List.of("Desktops", "Laptops & Notebooks", "Components", "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players"));

        for (WebElement menu : menuList) {
            Assert.assertTrue(expectedMenuList.contains(menu.getText()));
        }
    }
}

