package com.demoblaze.pruebas.stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import com.demoblaze.pruebas.steps.compraSteps;

import java.io.IOException;

public class compraStepDefinition {

    @Steps
    compraSteps compra;

    @Dado("^que un usuario se encuentra en la tienda de demoblaze$")
    public void queUnUsuarioSeEncuentraEnLaTiendaDeDemoblaze() {
        compra.abrirNavegador();
    }

    @Cuando("^agrega dos productos al carrito de compra, llenando el formulario$")
    public void agregaDosProductosAlCarritoDeCompraLlenandoElFormulario() throws IOException, InterruptedException {
        compra.clicEnLaptos();
        compra.clicEnSonyi5();
        compra.clicEnAddCart();
        compra.clickEnLogo();
        compra.clicEnMonitors();
        compra.clicEnAsus();
        compra.clicEnBtnAddCart();
        compra.clicEnCart();
        compra.validaTexto();
        compra.clicEnBtnOrder();
        compra.nombre();
        compra.pais();
        compra.ciudad();
        compra.tarjeta();
        compra.mes();
        compra.anio();
        compra.compra();
    }

    @Entonces("^visualiza la compra con exito$")
    public void visualizaLaCompraConExito() {
        compra.validaCompra();
        compra.clicEnOk();
    }

}
