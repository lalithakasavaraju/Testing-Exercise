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
public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public boolean isTitleDisplayed(String gameName){
        return driver.findElement(By.id("productTitle")).isDisplayed();
    }

    public void addingItemToBasket (){
        driver.findElement(By.xpath(".//*[@id='add-to-cart-button']")).click();
        Utils.waitForSomeTime(10000);
    }

   }
