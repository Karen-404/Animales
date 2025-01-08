/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.claseabstracta.Animales;

/**
 *
 * @author SO-LAB1-PC24
 */
public  class Lobos extends Caninos {
    @Override
    public String getNombreCientífico(){
        return "Canislupus";
    }
    
    @Override
    public String getSonido(){
        return "aullido";
    }
    
    @Override
    public String getAlimentos(){
        return "carnívora";
    }
    
    @Override
    public String getHábitat(){
        return "bosque";
    }
}
