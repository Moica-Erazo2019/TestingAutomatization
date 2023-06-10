package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.xml.namespace.QName;

public class App
{
    //agregar cosas extras a nuestros ambiente, objeto
    public static void main( String[] args )
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver pDriver = new ChromeDriver(chromeOptions);


        pDriver.get("https://www.saucedemo.com/");

        pDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        pDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        pDriver.findElement(By.id("login-button")).click();

        pDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        pDriver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();


        pDriver.findElement(By.id("shopping_cart_container")).click();

        pDriver.findElement(By.id("remove-sauce-labs-backpack")).click();


        pDriver.findElement(By.id("checkout")).click();



    }
}
