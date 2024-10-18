package com.automationExercise.stepDefinitions;

import com.automationExercise.pageObject.prodPageObject;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class prodStepDefinitions {

    WebDriver prod;
    Hook hook = new Hook();
    prodPageObject ProdPageObject;


    @Dado("que un usuario verifica que se encuentra en la pagina AutomationExercise")
    public void queUnUsuarioVerificaQueSeEncuentraEnLaPaginaAutomationExercise() throws InterruptedException {
        hook.setUp();
        prod = Hook.driver;
        prod.manage().window().maximize();
        ProdPageObject = new prodPageObject(prod);
        prod.get("https://automationexercise.com/");
        ProdPageObject.validaHome();
    }

    @Cuando("realice la busqueda de productos y los verifique")
    public void realiceLaBusquedaDeProductosYLosVerifique() throws IOException {
        ProdPageObject.clicEnBtnProd();
        ProdPageObject.validaAllProd();
        ProdPageObject.ingresaNomProd();
        ProdPageObject.clicEnBtnBuscar();
    }

    @Entonces("vera todos los prouctos relacionados con su busqueda")
    public void veraTodosLosProuctosRelacionadosConSuBusqueda() throws InterruptedException {
        ProdPageObject.validaLblSearched();
        ProdPageObject.validalblSubscription();
        prod.close();
    }
}
