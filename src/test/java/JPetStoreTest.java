import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.dog.Dog;

public class JPetStoreTest {
    @Test
    public void test1() {
        Browser browser = new Browser();
        browser.openBrowser().clickLinkElement("DOG");

        PageFactory.initElements(browser.getDriver(), Dog.class)
                .clickDog("K9-P0-02");


        ////*[@id="QuickLinks"]/a[2]/img --> go back to dog page






    }


    }


