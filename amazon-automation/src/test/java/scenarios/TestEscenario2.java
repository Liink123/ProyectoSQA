package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProductPage;
import pages.CartPage;
import org.openqa.selenium.By;

public class TestEscenario2 {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testAgregarYEliminarProductoEnOferta() {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.linkText("Today's Deals")).click();
        

        productPage.seleccionarPrimerProducto();
        productPage.agregarCarrito();

        cartPage.abrirCarrito();
        cartPage.eliminarProducto();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

