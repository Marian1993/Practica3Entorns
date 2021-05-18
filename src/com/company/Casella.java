package com.company;

public class Casella {
    private boolean ocupada;//per si està ocupada o no
    private boolean disparat;//per si la casella ha estat disparada o no
    private boolean disponible;//per si està disponible

    public Casella() {
        this.ocupada = false;
        this.disparat = false;
        this.disponible = true;
    }

    //getters i setters per accedir als atributs desde altres classes
    public Boolean getOcupada() {
        return ocupada;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Boolean getDisparat() {
        return disparat;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void setDisparat(Boolean disparat) {
        this.disparat = disparat;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }
}
