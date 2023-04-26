package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {  //can write anywhere but always execute first
        openBrowser(baseUrl); //open browser method inherited from baseclass
    }

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.id("user-name"), "standard_user"); //call utility class method to find and send keys
        sendTextToElement(By.id("password"), "secret_sauce");  ////call utility class method to find and send keys
        clickOnElement(By.id("login-button"));
        //verify "Products" text is displayed
        String name = verifyVisibleText(By.xpath("//span[text()='Products']"));
        System.out.println(name);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        sendTextToElement(By.id("user-name"), "standard_user"); //call utility class method to find and send keys
        sendTextToElement(By.id("password"), "secret_sauce");  ////call utility class method to find and send keys
        clickOnElement(By.id("login-button"));
        int product = countProductOnThePage(By.className("inventory_item"));
        System.out.println("Products on the page: " + product);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
