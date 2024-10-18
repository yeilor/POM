package com.demoblaze.pruebas.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alertas {

    public void alertaAceptar(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
