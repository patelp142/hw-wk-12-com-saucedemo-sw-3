package utilities;

import bowserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    //Click method
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Send keys method
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
    public  String verifyVisibleText(By by){
        return driver.findElement(by).getText();
    }
    public int countProductOnThePage(By by){
        int a =driver.findElements(by).size();
        return a;
    }
}
