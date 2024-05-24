package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Users/I528719/Downloads/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.in/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement nameElement = driver.findElement(By.id("ap_customer_name"));
        nameElement.sendKeys("Dharithri");
        WebElement mobileElement = driver.findElement(By.id("ap_phone_number"));
        mobileElement.sendKeys("9620016132");
        WebElement passwordElement = driver.findElement(By.id("ap_password"));
        passwordElement.sendKeys("sff");
        WebElement loginElement = driver.findElement(By.id("continue"));
        loginElement.click();
        System.exit(0);
    }
}


//package org.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "C:/Users/I528719/Downloads/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=674842289404&hvpos=&hvnetw=g&hvrand=4730590432280650786&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007785&hvtargid=kwd-29089120&hydadcr=5496_2359482&gad_source=1");
//
//        // List of test cases for Robust Worst Case BVA
//        List<String> testCases = Arrays.asList(
//                "", // Below minimum value
//                "a", // Minimum value
//                "ab", // Just above minimum value
//                new String(new char[50]).replace('\0', 'a'), // Typical value
//                new String(new char[99]).replace('\0', 'a'), // Just below maximum value
//                new String(new char[100]).replace('\0', 'a'), // Maximum value
//                new String(new char[101]).replace('\0', 'a') // Above maximum value
//        );
//
//        // Execute test cases
//        for (String testCase : testCases) {
//            executeTestCase(driver, wait, testCase);
//        }
//
//        driver.quit();
//    }
//
//    private static void executeTestCase(WebDriver driver, WebDriverWait wait, String input) {
//        try {
//            // Locate the search box
//            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
//
//            // Clear any existing text in the search box
//            searchBox.clear();
//
//            // Enter the test case input
//            searchBox.sendKeys(input);
//
//            // Locate the search button and click it
//            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
//            searchButton.click();
//
//            // Wait for the search results to load
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
//
//            // Verify the search results
//            WebElement searchResults = driver.findElement(By.id("nav-search-submit-button"));
//            if (searchResults.isDisplayed()) {
//                System.out.println("Test Case Passed for input: [" + input + "]");
//            } else {
//                System.out.println("Test Case Failed for input: [" + input + "]");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Test Case Encountered an Exception for input: [" + input + "]");
//            e.printStackTrace();
//        }
//    }
//}
