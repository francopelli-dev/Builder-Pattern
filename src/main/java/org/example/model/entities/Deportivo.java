package org.example.model.entities;

public class Deportivo implements Construc{

    private Auto auto;
    private int contador=1;
    @Override
    public void CrearChasis() {
        this.auto = new Auto();

        this.auto.setChasis("Deportivo "+contador);
        this.contador++;
    }

    @Override
    public void CrearPuertas() {
        this.auto.setAsientos(2);
    }

    @Override
    public void CrearAsientos() {
        this.auto.setPuertas(2);
    }

    @Override
    public Auto Resultado() {
        Auto res = this.auto;
        this.auto = null;
        return res;
    }
}
