package com.balmes.model;

public class Estudiant {

    private int estudiantId;
    private String estudiantNom;
    private String estudiantCognom;
    private Curs curs;

    public Estudiant(int estudiantId, String estudiantNom, String estudiantCognom, Curs curs) {
        this.estudiantId = estudiantId;
        this.estudiantNom = estudiantNom;
        this.estudiantCognom = estudiantCognom;
        this.curs = curs;
    }

    public int getEstudiantId() {
        return estudiantId;
    }

    public void setEstudiantId(int estudiantId) {
        this.estudiantId = estudiantId;
    }

    public String getEstudiantNom() {
        return estudiantNom;
    }

    public void setEstudiantNom(String estudiantNom) {
        this.estudiantNom = estudiantNom;
    }

    public String getEstudiantCognom() {
        return estudiantCognom;
    }

    public void setEstudiantCognom(String estudiantCognom) {
        this.estudiantCognom = estudiantCognom;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }


}
