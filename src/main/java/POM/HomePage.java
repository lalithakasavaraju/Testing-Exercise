package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lalitha on 17/04/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForGame(String game) {
        //Enter search text
        driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys(game);
        //selection
        driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
        //wait
        Utils.waitForSomeTime(5000);

    }

}
