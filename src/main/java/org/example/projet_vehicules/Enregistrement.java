package org.example.projet_vehicules;

public class Enregistrement {
    private String id,marque,modele,type,annee;

    public Enregistrement(String id, String marque, String modele, String type, String annee) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        this.annee = annee;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Enregistrement(String id, String marque, String modele, String type) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
