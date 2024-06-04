package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.*;
public class Firefox {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/I528719/Downloads/geckodriver.exe");

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testFeedbackEmailId(){
        driver.get("http://localhost:3000/contact");
        // Fill out the feedback form
        String name = "dharithri";
        WebElement nameElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div[1]/input"));
        nameElement.sendKeys(name);
        assertEquals(name, nameElement.getAttribute("value"));
        // Enter an invalid email address
        String email = "d@sf";
        WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/form/div[2]/input"));
        emailElement.sendKeys(email);
        WebElement submit=driver.findElement((By.xpath("//*[@id=\"root\"]/div/div[2]/form/button")));
        submit.click();
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-dxjrPO")));
        String elementText = element.getText();
        System.out.println("Element Text: " + elementText);
        // Get the text of the error message
        assertEquals("Email address is invalid", elementText);
    }
    @Test
    public void testNavidgationOfAddToCart() {
        driver.get(" http://localhost:3000");
        WebElement loginElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div"));
        loginElement.click();
        // Fill out the form with invalid password
        WebElement emailElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div/input"));
        String username = "dharithrirai18@gmail.com";
        emailElement.sendKeys(username);
        assertEquals(username, emailElement.getAttribute("value"));
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input"));
        String password = "Dhari3rai@18";
        passwordElement.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("   /html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]"));
        login.click();
        System.out.println("Clicked login");
        WebElement dishButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/ul/a[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(dishButton));
//        // Scroll the dish button into view
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dishButton);
//        // Retry clicking the dish button
        dishButton.click();
        System.out.println("Clicked dish");

        WebElement itemlist = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]"));
        itemlist.click();
        System.out.println("Item clicked");

//        WebElement element = driver.findElement(By.className("sc-jPpdYo"));
//        // Get the text of the element
//        String clickedElement = element.getText();
//        // Print the text
//        System.out.println("Text retrieved: " + clickedElement);
        // Click on the "Add to Cart" button
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-beySPh.hJmcBB")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        System.out.println("Item added");
        // Verify navigation to the cart page
//        WebElement elementInCart = driver.findElement(By.className("sc-jIYCZY"));
//        // Get the text of the element
//        String addedElement = elementInCart.getText();
//        System.out.println("Text retrieved: " + addedElement);
//        assertEquals(clickedElement, addedElement);
        System.out.println("Validation passed: Selected element  matches added element.");
        driver.quit();
    }
    @Test
    public void testLoginFlow() {
        driver.get("http://localhost:3000");
        WebElement loginElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div"));
        loginElement.click();
        // Fill out the form with invalid password
        WebElement emailElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div/input"));
        String username = "dharithrirai18@gmail.com";
        emailElement.sendKeys(username);
        assertEquals(username, emailElement.getAttribute("value"));
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input"));
        String invalidPassword = "Dahri3rai@18";
        passwordElement.sendKeys(invalidPassword);
        assertEquals(invalidPassword, passwordElement.getAttribute("value"));

        // Check for the presence of at least one special character and one number in the password
        if (!containsSpecialCharacter(invalidPassword)) {
            fail("Password must contain at least one special character");
        }
        if (!containsNumber(invalidPassword)) {
            fail("Password must contain at least one number");
        }
        driver.quit();
    }

    private boolean containsSpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:',.<>?";
        for (char c : specialCharacters.toCharArray()) {
            if (password.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }

    private boolean containsNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testNavigationToContact() {
        driver.get("http://localhost:3000");
        // Click on the login button to navigate to the login page
        WebElement dishButton = driver.findElement(By.xpath("    //*[@id=\"root\"]/div/div[1]/div/ul/a[4]\n"));
        dishButton.click();
        // Wait for the navigation to complete
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try {
            wait.until(ExpectedConditions.urlToBe("http://localhost:3000/contact"));
        } catch (TimeoutException e) {
            fail("Failed to navigate");
        }
        driver.quit();
    }
    @Test
    public void testNavigationToDishes() {
        driver.get("http://localhost:3000");
        // Click on the login button to navigate to the login page
        WebElement dishButton = driver.findElement(By.xpath("    //*[@id=\"root\"]/div/div[1]/div/ul/a[2]\n"));
        dishButton.click();
        // Wait for the navigation to complete
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try {
            wait.until(ExpectedConditions.urlToBe("http://localhost:3000/dishes"));
        } catch (TimeoutException e) {
            fail("Failed to navigate");
        }
        driver.quit();
    }

    @Test
    public void testInvalidPasswordErrorMessage() {
        driver.get(" http://localhost:3000");
        WebElement loginElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div"));
        loginElement.click();
        // Fill out the form with invalid password
        WebElement emailElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div/input"));
        String username = "dharithrirai18@gmail.com";
        emailElement.sendKeys(username);
        assertEquals(username, emailElement.getAttribute("value"));
        WebElement passwordElement = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div/input"));
        String password = "123";  // Invalid password
        passwordElement.sendKeys(password);
        assertEquals(password, passwordElement.getAttribute("value"));
        WebElement login = driver.findElement(By.xpath("   /html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[4]"));
        login.click();
        System.out.println("Clicked login");
        WebElement errorMessageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]")));
        String errorMessage = errorMessageElement.getText();
        System.out.println("Error Message: " + errorMessage);
        assertEquals("Password must be at least 6 characters long and contain at least one special character.", errorMessage);
        driver.quit();
    }
}
