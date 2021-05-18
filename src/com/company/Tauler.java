package com.company;

public class Tauler {
    //ATRIBUTS
    private static final int DIMENSIO = 10; //número de columnes i files
    private Casella t[][];

    private VaixellsUsuari vu = new VaixellsUsuari();

    public Tauler() {
        t = new Casella[DIMENSIO][DIMENSIO];

        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                t[i][j] = new Casella();
            }
        }
    }

    //mètodes per obtenir informacio sobre caselles concretes...

    public boolean estatCasella(int x, int y){

        if(t[y][x].getDisparat()){
            return t[y][x].getDisparat();

        }if(!t[x][y].getOcupada() && t[x][y].getDisponible()){
            return !t[x][y].getOcupada() && t[x][y].getDisponible();

        }if(t[y][x].getOcupada()){
            return t[y][x].getOcupada();

        }else {
            return false;
        }
    }

    public void setDisparada(int x, int y, boolean disparada) {
        t[x][y].setDisparat(disparada);
    }

    public void disponible(int x, int y) {
        t[x][y].setDisponible(Boolean.FALSE);
    }

    public void reiniciar(Tauler tauler) {

        netejarTauler();

        //per tornar a posar els vaixells...
        vu.setColocat1(false);
        vu.setColocat2(false);
        VaixellsUsuari.setVaixellsColocats(false);
        vu.setVaixell1(4);
        vu.setVaixell2(3);
    }
    private void netejarTauler(){

        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                t[j][i].setDisparat(false);
                t[j][i].setOcupada(false);
                t[j][i].setDisponible(true);

                t[j][i] = new Casella();
            }
        }
    }
}
