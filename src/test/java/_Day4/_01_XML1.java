package _Day4;

import org.testng.annotations.*;

public class _01_XML1 {
    @BeforeSuite
    void beforeSuitMethod(){
        System.out.println("Before suit runs");
    }

    @BeforeTest
    void beforeTestMethod(){
        System.out.println("Before Test runs");
    }

    @BeforeGroups
    void beforeGroupsMethod(){
        System.out.println("Before Groups runs");
    }

    @BeforeClass
    void beforeClassMethod(){
        System.out.println("Before Class runs");
    }

    @BeforeMethod
    void beforeMethodMethod(){
        System.out.println("Before Method runs");
    }

    @Test
    void test1(){
        System.out.println("Test 1 runs");
    }

    @Test
    void test2(){
        System.out.println("Test 2 runs");
    }

    @AfterMethod
    void afterMethodMethod(){
        System.out.println("After Method runs");
    }

    @AfterClass
    void afterClassMethod(){
        System.out.println("After Class runs");
    }

    @AfterGroups
    void afterGroupMethod(){
        System.out.println("After Group runs");
    }

    @AfterTest
    void afterTestMethod(){
        System.out.println("After Test runs");
    }

    @AfterSuite
    void afterSuitMethod(){
        System.out.println("After Suit runs");
    }
}
