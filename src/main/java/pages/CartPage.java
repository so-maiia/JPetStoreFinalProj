package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.dog.Dog;

public class CartPage {
    @FindBy (id = "Shopping Cart")
    private WebElement selectPoodle;
    WebDriver driver = Browser.getDriver();
    public Dog validateDogPage() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Shopping Cart"));
        return this.validateDogPage();
    }
    WebElement cartLink = driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
        cartLink.click();
}
