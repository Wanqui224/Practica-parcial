/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import java.util.ArrayList;

/**
 *
 * @author mafer
 */
public class Juez extends Persona{
    private int edad;
    private ArrayList<Juego> juegos;

    public Juez(int edad, ArrayList<Juego> juegos, String nombre) {
        super(nombre);
        this.edad = edad;
        this.juegos = juegos;
    }
    
}
