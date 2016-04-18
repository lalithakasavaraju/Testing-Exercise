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
public class ConfirmationPage extends BasePage {
    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }
    public void editProduct(){
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='huc-v2-order-row-confirm-text']/h1")).isDisplayed());
        driver.findElement(By.xpath(".//*[@id='hlb-view-cart-announce']")).click();

            }
    public boolean isAddedToBasketDisplayed(){
        return driver.findElement(By.xpath(".//*[@id='huc-v2-order-row-confirm-text']/h1")).getText().equalsIgnoreCase("Added to Basket");
    }

}
