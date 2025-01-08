/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstracta.Animales;

/**
 *
 * @author SO-LAB1-PC24
 */
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitad;
    protected String nombreCientifico;
    
    public abstract String getNombreCientífico();
    
    public abstract String getSonido();
    
    public abstract String getAlimentos();
    
    public abstract String getHábitat();
}
