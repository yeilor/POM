package com.demoblaze.pruebas.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class compraPageObject extends PageObject {

    By btnLaptops = By.xpath("(//a[@id='itemc'])[2]");
    By lblSonyi5 = By.xpath("//a[contains(text(), 'i5')]");
    By btnAddCart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By imgLogo = By.id("nava");
    By btnMonitors = By.xpath("(//a[@id='itemc'])[3]");
    By lblAsus = By.xpath("//a[contains(text(), 'HD')]");
    By btnCartAdd = By.xpath("//a[@class='btn btn-success btn-lg']");
    By lblCart = By.id("cartur");
    By lblProducts = By.xpath("//h2[contains(text(), 'Products')]");
    By btnOrder = By.xpath("//button[@class='btn btn-success']");
    By txtName = By.id("name");
    By txtCountry = By.id("country");
    By txtCity = By.id("city");
    By txtCard = By.id("card");
    By txtMonth = By.id("month");
    By txtYear = By.id("year");
    By btnPurchase = By.xpath("(//button[@class='btn btn-primary'])[3]");
    By lblThankYou = By.xpath("//h2[contains(text(), 'Thank you')]");
    By btnOk = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

    public By getBtnLaptops() {
        return btnLaptops;
    }

    public By getLblSonyi5() {
        return lblSonyi5;
    }

    public By getBtnAddCart() {
        return btnAddCart;
    }

    public By getImgLogo() {
        return imgLogo;
    }

    public By getBtnMonitors() {
        return btnMonitors;
    }

    public By getLblAsus() {
        return lblAsus;
    }

    public By getBtnCartAdd() {
        return btnCartAdd;
    }

    public By getLblCart() {
        return lblCart;
    }

    public By getLblProducts() {
        return lblProducts;
    }

    public By getBtnOrder() {
        return btnOrder;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtCountry() {
        return txtCountry;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtCard() {
        return txtCard;
    }

    public By getTxtMonth() {
        return txtMonth;
    }

    public By getTxtYear() {
        return txtYear;
    }

    public By getBtnPurchase() {
        return btnPurchase;
    }

    public By getLblThankYou() {
        return lblThankYou;
    }

    public By getBtnOk() {
        return btnOk;
    }
}
