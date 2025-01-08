/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.claseabstracta;

import ec.edu.espoch.claseabstracta.Animales.Animal;
import ec.edu.espoch.claseabstracta.Animales.Gatos;
import ec.edu.espoch.claseabstracta.Animales.Leones;
import ec.edu.espoch.claseabstracta.Animales.Lobos;
import ec.edu.espoch.claseabstracta.Animales.Perros;

/**
 *
 * @author SO-LAB1-PC24
 */
public class ClaseAbstracta {

    public static void main(String[] args) {

        Animal[] animales = new Animal[4];

        animales[0] = new Gatos();
        animales[1] = new Perros();
        animales[2] = new Lobos();
        animales[3] = new Leones();

        for (int i = 0; i < animales.length; i++) {
            System.out.println("El nombre cientifico es; "+animales[i].getNombreCientífico());
            System.out.println("El alimento es; "+animales[i].getAlimentos());
            System.out.println("El habitad es; "+animales[i].getHábitat());
            System.out.println("El sonido es; "+animales[i].getSonido());
        }
 
    }

}
