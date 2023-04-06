/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dofussort;

import java.util.ArrayList;


/**
 *
 * @author erwan
 */
public class Personnage {
    private String nom;
    private Classe classe;
    private int niveau;
    private int feuStatistique;
    private int eauStatistique;
    private int airStatistique;
    private int terreStatistique;
    private ArrayList<Sort> listeSort;

    public Personnage(String nom, Classe classe) {
        this.nom = nom;
        this.classe = classe;
        this.niveau = 1;
        this.airStatistique = 0;
        this.eauStatistique = 0;
        this.feuStatistique = 0;
        this.terreStatistique = 0;
        this.listeSort = new ArrayList<Sort>();
    }
    public void addSort(Sort sortAjout)
    {
        this.listeSort.add(sortAjout);
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", classe=" + classe + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getFeuStatistique() {
        return feuStatistique;
    }

    public void setFeuStatistique(int feuStatistique) {
        this.feuStatistique = feuStatistique;
    }

    public int getEauStatistique() {
        return eauStatistique;
    }

    public void setEauStatistique(int eauStatistique) {
        this.eauStatistique = eauStatistique;
    }

    public int getAirStatistique() {
        return airStatistique;
    }

    public void setAirStatistique(int airStatistique) {
        this.airStatistique = airStatistique;
    }

    public int getTerreStatistique() {
        return terreStatistique;
    }

    public void setTerreStatistique(int terreStatistique) {
        this.terreStatistique = terreStatistique;
    }   
        public void question6(){
        System.out.println(this.nom); 
        System.out.println(this.classe);
        System.out.println(this.niveau);
        System.out.println(this.airStatistique);
        System.out.println(this.eauStatistique);
        System.out.println(this.terreStatistique);
        System.out.println(this.feuStatistique);
        
    }
}
