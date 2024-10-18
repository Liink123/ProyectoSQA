package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProductPage;

public class TestEscenario1 {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void testAgregarDosProductosAlCarrito() {
        driver.get("https://www.amazon.com/");

        homePage.buscarProducto("Producto1");
        productPage.seleccionarPrimerProducto();
        productPage.agregarCarrito();

        homePage.buscarProducto("Producto2");
        productPage.seleccionarPrimerProducto();
        productPage.agregarCarrito();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

