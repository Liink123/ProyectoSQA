package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By cantidadCarrito = By.id("nav-cart-count");
    By botonEliminar = By.xpath("//input[@value='Delete']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirCarrito() {
        driver.findElement(cantidadCarrito).click();
    }

    public void eliminarProducto() {
        driver.findElement(botonEliminar).click();
    }
}
