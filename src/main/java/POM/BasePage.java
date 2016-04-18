package POM;

import org.openqa.selenium.WebDriver;

/**
 * Created by Lalitha on 17/04/2016.
 */
public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
