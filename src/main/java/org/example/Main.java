package org.example;

import org.example.model.entities.Auto;
import org.example.model.entities.AutoStandard;
import org.example.model.entities.Builder;
import org.example.model.entities.Deportivo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desarrollo del Builder");
        Builder director = new Builder(new Deportivo());
        Auto auto =director.Construir();
        Auto auto2 =director.Construir();
        director.setConstruc(new AutoStandard());
        Auto auto3 = director.Construir();
        List<Auto> lista = new ArrayList<>();
        lista.add(auto);
        lista.add(auto2);
        lista.add(auto3);
        System.out.println(lista);
    }
}