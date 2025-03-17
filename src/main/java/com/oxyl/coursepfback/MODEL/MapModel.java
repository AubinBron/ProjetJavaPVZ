package com.oxyl.coursepfback.MODEL;

public class MapModel {
    private int ligne;
    private int colonne;
    private String chemin_image;

    public MapModel() {
    }

    public MapModel(int ligne, int colonne, String chemin_image) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.chemin_image = chemin_image;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public void setColonne(int colonne) {
        this.colonne = colonne;
    }

    public String getChemin_image() {
        return chemin_image;
    }

    public void setChemin_image(String chemin_image) {
        this.chemin_image = chemin_image;
    }


    public void afficher() {
        System.out.println("ligne = " + ligne + "\n colonne = " + colonne + "\n chemin_image = " + chemin_image );
    }
}
