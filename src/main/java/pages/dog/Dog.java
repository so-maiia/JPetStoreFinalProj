package pages.dog;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dog {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr/td/a")
    private List<WebElement> dogNameLinks;
    private List<WebElement> poodleLink;

    public void clickDog(String dogName){
        for (WebElement element : dogNameLinks){
            if(element.getText().equalsIgnoreCase("poodle")){
                element.click();
                break;
            }
        }
    }
    public Dog clickOnAddToCart(){
        clickOnAddToCart();
        WebDriver driver = new ChromeDriver();
        return PageFactory.initElements(driver,Dog.class);
    }


}

