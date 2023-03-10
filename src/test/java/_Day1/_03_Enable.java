package _Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _03_Enable {



    @BeforeMethod
    public void first(){
        System.out.println("please log in to your count");
    }

    @Test
    public void loginTest(){
        System.out.println("Login test ");
    }
    @Test(enabled = false) // I don't want to run it
    public void addToCart(){
        System.out.println("Add to cart test is successful ");
    }
    @Test
    public void checkOutTest(){
        System.out.println("checkout is successful");
    }

    @AfterMethod
    public void last(){
        System.out.println("Thank you for supporting our business");
    }


}
