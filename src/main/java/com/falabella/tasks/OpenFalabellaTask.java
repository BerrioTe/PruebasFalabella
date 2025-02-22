package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenFalabellaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Open.url("https://www.falabella.com.co/falabella-co")
        );
    }
    public  static OpenFalabellaTask openBrowser(){
        return instrumented(OpenFalabellaTask.class);
    }
}
