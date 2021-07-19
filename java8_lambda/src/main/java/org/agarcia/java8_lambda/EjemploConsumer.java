package org.agarcia.java8_lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<Date> cons = fechahoy -> {
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatofecha.format(fechahoy));
        };
        cons.accept(new Date());

        BiConsumer<String,Integer> consDos = (nombre, edad) -> System.out.println("El señor " + nombre + " tiene " + edad + " años de edad");
        consDos.accept("Ariel",42);
    }
}
