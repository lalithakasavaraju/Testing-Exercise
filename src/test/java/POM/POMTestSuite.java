package POM;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Lalitha on 17/04/2016.
 */
public class POMTestSuite {

    static WebDriver driver;

    @BeforeClass
    public static void before(){
        driver = new FirefoxDriver();
        System.out.println("driver initiated");
        driver.get("http://www.amazon.co.uk/");
        System.out.println("opened amazon");
        driver.manage().window().maximize();
        Utils.waitForSomeTime(5000);
        System.out.println(driver.getTitle());

    }
    @AfterClass
    public static void after(){
        driver.quit();
        driver=null;
    }

    @Test

    public void addProductToTheBasket(){
        String name = "Dead of Winter";
        String displayName = "Dead of Winter: A Crossroads Game";
        HomePage homePage = new HomePage(driver);
        homePage.searchForGame(name);

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.isGameDisplayed(name);
        Assert.assertTrue(productsPage.isGameDisplayed(name));
        productsPage.switchWindow();

        ProductDetailPage productdetailpage = new ProductDetailPage(driver);
        productdetailpage.isTitleDisplayed(displayName);
        Assert.assertTrue(productdetailpage.isTitleDisplayed(displayName));
        productdetailpage.addingItemToBasket();

        ConfirmationPage confirmpage = new ConfirmationPage(driver);
        Assert.assertTrue(confirmpage.isAddedToBasketDisplayed());
        confirmpage.editProduct();

        BasketPage basketpage = new BasketPage(driver);
        Assert.assertTrue(basketpage.isShoppingBasketDisplayed());
        basketpage.addGiftOption();
        basketpage.updateQuantityInTheBasket();
        Assert.assertTrue(basketpage.isQuantityUpdated());

        basketpage.deleteItemsfromBasket();
        Assert.assertTrue(basketpage.isItemDeleted());


    }

}
