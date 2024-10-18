package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    
    By primerProducto = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]");
    By botonAgregarCarrito = By.id("add-to-cart-button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarPrimerProducto() {
        driver.findElement(primerProducto).click();
    }

    public void agregarCarrito() {
        driver.findElement(botonAgregarCarrito).click();
    }
}
