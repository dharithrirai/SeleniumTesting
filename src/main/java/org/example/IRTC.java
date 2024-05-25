package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.*;
public class IRTC {


    /*Consider the following test cases: 
     * 1. field 1 - MAC, field 2 - SBC
     * 2. field 1 - KSR BENGALURU-SBC, field 2 - SBC
     * 3. field 1 - KSR BENGALURU-SBC, field 2 - TRIVANDRUM CENTRAL-TVC (THIRUVANANTHAPURAM)
     * 4. field 1 - SBC, field 2 - KSR BENGALURU-SBC
     * 5. field 1 - MA, field 2 - MYC
     * 6. field 1 - 12345678910111213141, field 2 - SBC
     * 7. field 1 - 123456789101112131415, field 2 - 123456789101112131415
     * 8. field 1 - aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, field 2 - SBC
     * 9. field 1 - 123456789101112131415, field 2 - S
     * 
*/

    // Write a function to perform whatever main is doing but as a function
    public static void test1() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("MAQ");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test2() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("MAC");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test3() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("KSR BENGALURU-SBC");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }

    public static void test4() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("SBC");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("Trivanthapuram Central-TVC (Thiruvananthapuram)");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test5() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("SBC");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("KSR BENGALURU-SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test6() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("MA");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("MYC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test7() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("1234567891011121314");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test8() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("12345678910111213141");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("12345678910111213141");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test9() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("12345678910111213141");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("S");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }


    public static void test10() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }

    public static void test10() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys(" ");
        Actions action1 = new Actions(driver);
        action1.moveToElement(fromElement).sendKeys(Keys.ENTER).perform();
        WebElement toElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[2]/p-autocomplete/span/input"));
        toElement.sendKeys("SBC");
        Actions action2 = new Actions(driver);
        action2.moveToElement(toElement).sendKeys(Keys.ENTER).perform();
        WebElement loginElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button"));
        loginElement.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@class='search_btn train_Search']"));
        searchButton.click();
        System.exit(0);
    }

    
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Users/I584064/Downloads/geckodriver.exe");
        
        //write function calls for each test case using switch case

        System.out.println("Enter the test case you want to execute");
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();


        switch (testCase) {
            case "1":
                test1();
                break;
            case "2":
                test2();
                break;
            case "3":
                test3();
                break;
            case "4":
                test3();
                break;
            case "5":
                test3();
                break;
            case "6":
                test3();
                break;
            case "7":
                test3();
                break;
            case "8":
                test3();
                break;
            case "9":
                test3();
                break;
            case "10":
                test3();
                break;

            case "11":
                test3();
                break;
            default:
                System.out.println("Invalid test case");
                break;
        }
    }

}


