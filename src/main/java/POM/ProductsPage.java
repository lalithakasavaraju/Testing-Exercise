package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Lalitha on 17/04/2016.
 */
public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGameDisplayed(String game){
        return driver.findElement(By.xpath(".//*[@id='s-result-count']/span/span")).isDisplayed();
    }

    public void switchWindow(){
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();
        // Perform the operation that opens new window
        driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[1]/div/div/a/img")).click();
        Utils.waitForSomeTime(15000);
        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }
}
