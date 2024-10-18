package com.automationExercise.pageObject;

import com.automationExercise.utils.DatosExcel;
import com.automationExercise.utils.Scroll;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class prodPageObject {

    WebDriver prod;
    DatosExcel datosExcel = new DatosExcel();
    Scroll scroll = new Scroll();

    By imgLogo = By.xpath("//div[@class='logo pull-left']");
    By btnProd = By.xpath("//i[@class='material-icons card_travel']");
    By lblAllProd = By.xpath("//h2[contains(text(), 'All Products')]");
    By txtProd = By.xpath("//input[@class='form-control input-lg']");
    By btnBuscar = By.id("submit_search");
    By lblSearched = By.xpath("//h2[contains(text(), 'Searched Products')]");
    By lblSubscription = By.className("single-widget");


    public prodPageObject(WebDriver prod) {
        this.prod = prod;
    }

    public void validaHome() {
        assertThat(prod.findElement(imgLogo).isDisplayed(), Matchers.is(true));
    }

    public void clicEnBtnProd() {
        prod.findElement(btnProd).click();
    }

    public void validaAllProd() {
        assertThat(prod.findElement(lblAllProd).isDisplayed(), Matchers.is(true));
    }

    public void ingresaNomProd() throws IOException {
        prod.findElement(txtProd).sendKeys(datosExcel.obtenerDatos("Data", "prodData.xlsx", 3, 0));
    }

    public void clicEnBtnBuscar() {
        prod.findElement(btnBuscar).click();
    }

    public void validaLblSearched() {
        assertThat(prod.findElement(lblSearched).isDisplayed(), Matchers.is(true));
    }

    public void validalblSubscription() throws InterruptedException {
        scroll.scrollAlElemento(prod, lblSubscription);
        assertThat(prod.findElement(lblSubscription).isDisplayed(), Matchers.is(true));
        Thread.sleep(2000);
    }
}
