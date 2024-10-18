package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    
    By barraBusqueda = By.id("twotabsearchtextbox");
    By botonBusqueda = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void buscarProducto(String producto) {
        driver.findElement(barraBusqueda).sendKeys(producto);
        driver.findElement(botonBusqueda).click();
    }
}
