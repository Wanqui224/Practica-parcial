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
public class Jugador extends Persona{
    private int sueldo;
    private ArrayList<Juego> juegos;

    public Jugador(int sueldo, ArrayList<Juego> juegos, String nombre) {
        super(nombre);
        this.sueldo = sueldo;
        this.juegos = juegos;
    }
    
}
