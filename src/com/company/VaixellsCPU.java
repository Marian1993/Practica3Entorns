package com.company;

import java.util.Random;

public class VaixellsCPU {
    private int x, y;//coordenades de la casella
    private boolean colocat, orientacio;

    /**
     * distribucioAleatoria. Posa els vaixells de la cpu aleatòriament al tauler.
     *
     * @param cpu Tauler on es distribueixen els vaixells
     */
    public void distribucioAleatoria(Tauler cpu) {

        for (int i = 0; i < 3; i++) {
            posarVaixell(cpu, 2);
        }
        for (int i = 0; i < 4; i++) {
            posarVaixell(cpu, 1);
        }
    }

    /**
     * posar. Mètode per col·locar, aleatòriament, un vaixell.
     *
     * @param cpu Tauler que reb per paràmetre on posa el vaixell. orientacio:
     * Boolean que indica si el vaixell està col·locat en vertical (false) o
     * horitzontal (true). coloca: Boolean per controlar si el vaixell ha esta
     * col·locat correctament.
     */
    private void posarVaixell(Tauler cpu, int mida) {

        while (true) {
            // generar casella aleatoria
            y = (int) (Math.random() * (9 + 1));
            x = (int) (Math.random() * (9 + 1));
            // generar orientació aleatoria
            Random r = new Random();
            orientacio = r.nextBoolean();
            if (cpu.estatCasella(y, x)) {
                if (esPotPosar(cpu, mida)) {
                    colocar(cpu, mida);
                    break;
                }
            }
        }
    }

    /**
     * espaiDisponible. S'encarrega, una vegada tenim la casella inicial i
     * l'orientació d'un vaixell, de mirar si no xocaria ni tocaria cap altre
     * vaixell en ser col·locat.
     *
     * @param cpu
     * @param mida
     * @return espaiDisponible
     */
    private boolean espaiDisponible(Tauler cpu, int mida) { //sa borrat
        if (orientacio) {
            for (int i = y; i <= y + mida; i++) {

                for (int j = x; j <= x; j++) {

                    if (!cpu.estatCasella(y, x)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * hiCab. Mètode que mira si un vaixell té lloc suficient per a ser
     * col·locat sense sortir del tauler.
     *
     * @param mida Número de caselles que ocupa el vaixell
     * @return hiCab
     */
    private boolean hiCab(int mida) {
        // codi suprimit per l'exercici
        return true;
    }

    /**
     * esPotPosar. Retorna si un vaixell té lloc suficient dins el tauler (no
     * sortiria per defora) i si tocaria o es xocaria amb un altre vaixell.
     *
     * @param cpu
     * @param mida
     * @return
     */
    private boolean esPotPosar(Tauler cpu, int mida) {
        return hiCab(mida) && espaiDisponible(cpu, mida);
    }

    /**
     * colocar. Mètode per posar el vaixell al tauler. Segons el boolean
     * 'orientacio' es posa en horitzontal o en vertical.
     *
     * @param cpu Tauler al qual es posa el vaixell
     * @param mida Número de caselles que ocupa el vaixell
     */
    private void colocar(Tauler cpu, int mida) {
        // int xInicial, yInicial, xFinal, yFinal;
        // codi suprimit per l'exercici
        // disponibilitat(cpu, xInicial, yInicial, xFinal, yFinal);
    }

    /**
     * disponibilitat. Aquest mètode s'encarrega de posar 'disponible=false' a
     * les caselles que envolten un vaixell. Així, a l'hora de posar un nou
     * vaixell, no es tocarà amb els altres.
     *
     * @param cpu Tauler al qual es posen les peces
     * @param xi Coordenada 'x' inicial del vaixell
     * @param yi Coordenada 'y' inicial del vaixell
     * @param xf Coordenada 'x' final del vaixell
     * @param yf Coordenada 'y' final del vaixell
     */
    private void disponibilitat(Tauler cpu, int xi, int yi, int xf, int yf) {
        // codi suprimit per l'exercici
    }

    /*
     * Retorna si un vaixell ha estat col·locat o no al tauler
     */
    public boolean colocat() {
        return colocat;
    }
}
