package _Day1;

import org.testng.annotations.Test;



public class _01_IntroPart2 {

    @Test(priority = 1)
    public void loginTest(){
        System.out.println("Login test ");
    }
    @Test(priority = 2)
    public void addToCart(){
        System.out.println("Add to cart test is successful ");
    }
    @Test(priority = 3)
    public void checkOutTest(){
        System.out.println("checkout is successful");
    }



}
