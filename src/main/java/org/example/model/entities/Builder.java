package org.example.model.entities;



public class Builder {
    private Construc construc;

    public void setConstruc(Construc construc) {
        this.construc = construc;
    }

    public Builder(Construc construc) {
        this.construc = construc;
    }

    public Auto Construir() {
        construc.CrearChasis();
        construc.CrearAsientos();
        construc.CrearPuertas();
        return construc.Resultado();
    }
}
