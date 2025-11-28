package com.example.kuhasz;

public class Przepis {
    private String nazwyPrzepisu, kategoria, skladniki, opis;
    private int idObrazka;

    public Przepis(String nazwyPrzepisu) {
        this.nazwyPrzepisu = nazwyPrzepisu;
        kategoria = "ciasteczka";
        skladniki = "";
        opis = "";
        idObrazka = R.drawable.wuzetka;
    }

    @Override
    public String toString() {
        return nazwyPrzepisu;
    }

    public Przepis(String nazwyPrzepisu, String kategoria, String skladniki, String opis, int idObrazka) {
        this.nazwyPrzepisu = nazwyPrzepisu;
        this.kategoria = kategoria;
        this.skladniki = skladniki;
        this.opis = opis;
        this.idObrazka = idObrazka;
    }

    public String getNazwyPrzepisu() {
        return nazwyPrzepisu;
    }

    public void setNazwyPrzepisu(String nazwyPrzepisu) {
        this.nazwyPrzepisu = nazwyPrzepisu;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
