package com.falabella.stepDefinitions;

import com.falabella.tasks.BuscarTask;
import com.falabella.tasks.OpenFalabellaTask;
import io.cucumber.java.es.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CompraFalabellaStepDef {
    @Dado("que el usuario esta en la pagina de falabella")
    public void queElUsuarioEstaEnLaPaginaDeFalabella() {
        theActorCalled("User").wasAbleTo(
                OpenFalabellaTask.openBrowser());

    }
    @Cuando("agrega productos al carrito")
    public void agregaProductosAlCarrito() {
        BuscarTask.buscarTask();
    }
    @Entonces("valida que sean los productos y sus cantidades")
    public void validaQueSeanLosProductosYSusCantidades() {

    }
}
