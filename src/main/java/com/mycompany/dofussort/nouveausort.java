/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dofussort;
import java.util.ArrayList;
/**
 *
 * @author Manu
 */
public class nouveausort {
      private String nom;
    private ArrayList<nouveausort> listeSort;
    private String bonus;
    private int degatMax;
    private int degatMin;
    private int niveau;
    private String element;

    public nouveausort(String nom, int degatMax, int degatMin, int niveau, String element) {
        this.nom = nom;
        this.degatMax = degatMax;
        this.degatMin = degatMin;
        this.niveau = niveau;
        this.element = element;
    }
    
    public nouveausort(String bonus,String nom) {
        this.nom = nom;
        this.bonus = bonus;
        this.listeSort = new ArrayList<nouveausort>();
        
    }
}

