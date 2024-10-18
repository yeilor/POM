package com.demoblaze.pruebas.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import com.demoblaze.pruebas.pageObjects.compraPageObject;
import com.demoblaze.pruebas.utils.Alertas;
import com.demoblaze.pruebas.utils.DatosExcel;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class compraSteps {

    compraPageObject compra = new compraPageObject();
    DatosExcel datosExcel = new DatosExcel();
    Alertas alertas = new Alertas();

    @Step
    public void abrirNavegador() {
        compra.open();
    }

    @Step
    public void clicEnLaptos() {
        compra.getDriver().findElement(compra.getBtnLaptops()).click();
    }

    @Step
    public void clicEnSonyi5() {
        compra.getDriver().findElement(compra.getLblSonyi5()).click();
    }

    @Step
    public void clicEnAddCart() throws InterruptedException {
        compra.getDriver().findElement(compra.getBtnAddCart()).click();
        Thread.sleep(2000);
        alertas.alertaAceptar(compra.getDriver());
    }

    @Step
    public void clickEnLogo() {
        compra.getDriver().findElement(compra.getImgLogo()).click();
    }

    @Step
    public void clicEnMonitors() {
        compra.getDriver().findElement(compra.getBtnMonitors()).click();
    }

    @Step
    public void clicEnAsus() {
        compra.getDriver().findElement(compra.getLblAsus()).click();
    }

    @Step
    public void clicEnBtnAddCart() throws InterruptedException {
        compra.getDriver().findElement(compra.getBtnCartAdd()).click();
        Thread.sleep(2000);
        alertas.alertaAceptar(compra.getDriver());
    }

    @Step
    public void clicEnCart() {
        compra.getDriver().findElement(compra.getLblCart()).click();
    }

    @Step
    public void validaTexto() {
        assertThat(compra.getDriver().findElement(compra.getLblProducts()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clicEnBtnOrder() {
        compra.getDriver().findElement(compra.getBtnOrder()).click();
    }

    @Step
    public void nombre() throws IOException {
        compra.getDriver().findElement(compra.getTxtName()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 1, 1));
    }

    @Step
    public void pais() throws IOException {
        compra.getDriver().findElement(compra.getTxtCountry()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 2, 1));
    }

    @Step
    public void ciudad() throws IOException {
        compra.getDriver().findElement(compra.getTxtCity()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 3, 1));
    }

    @Step
    public void tarjeta() throws IOException {
        compra.getDriver().findElement(compra.getTxtCard()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 4, 1));
    }

    @Step
    public void mes() throws IOException {
        compra.getDriver().findElement(compra.getTxtMonth()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 5, 1));
    }

    @Step
    public void anio() throws IOException {
        compra.getDriver().findElement(compra.getTxtYear()).sendKeys(datosExcel.obtenerDatos("Data", "orderData.xlsx", 6, 1));
    }

    @Step
    public void compra() {
        compra.getDriver().findElement(compra.getBtnPurchase()).click();
    }

    @Step
    public void validaCompra() {
        assertThat(compra.getDriver().findElement(compra.getLblThankYou()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clicEnOk() {
        compra.getDriver().findElement(compra.getBtnOk()).click();
    }
}
