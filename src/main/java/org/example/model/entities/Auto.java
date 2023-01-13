package org.example.model.entities;

public class Auto {
    private String chasis;
    private int puertas;
    private int asientos;

    public String getChasis() {
        return chasis;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String toString(){
        return this.getChasis();
    }
}
