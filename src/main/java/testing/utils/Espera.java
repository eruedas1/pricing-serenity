package testing.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Espera implements Interaction {
    private final int segundos;

    public Espera(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("La espera fue interrumpida", e);
        }
    }

    public static Espera unosSegundos(int segundos) {
        return new Espera(segundos);
    }
}