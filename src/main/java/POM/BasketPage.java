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
public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void addGiftOption() {
        driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[4]/span/span/div/label/input")).click();
        Utils.waitForSomeTime(5000);
    }


    public void updateQuantityInTheBasket(){
        driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[3]/div/div/span/span/span/span")).click();
        driver.findElement(By.xpath(".//*[@id='dropdown1_1']")).click();
        Utils.waitForSomeTime(15000);
        }
    public boolean isQuantityUpdated(){
        return driver.findElement(By.xpath(".//*[@id='gutterCartViewForm']/div[3]/div[2]/div/div[1]/p/span/span[1]")).isDisplayed();
    }

    public void deleteItemsfromBasket(){
        driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/div/span[1]/span/input")).click();
        Utils.waitForSomeTime(15000);

    }

    public boolean isShoppingBasketDisplayed(){

        return driver.findElement(By.xpath(".//*[@id='sc-active-cart']/div/h2")).getText().equalsIgnoreCase("Shopping basket");
    }
    public boolean isItemDeleted(){
        return driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[3]/div[1]/span")).isDisplayed();
    }
}
