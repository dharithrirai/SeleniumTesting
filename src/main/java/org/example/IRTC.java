package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
public class IRTC {

    //Write a function to perform whatever main is doing but as a function
    public static void test1() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement fromElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]/div[1]/p-autocomplete/span/input"));
        fromElement.sendKeys("123456789101112131415");
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

    
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Users/I584064/Downloads/geckodriver.exe");
        //switch case to select test cases based on input number

        test1();
    }
}

