/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.juego;

import java.util.ArrayList;

/**
 *
 * @author Wanki
 */
public class Juego {
    private Jugador jugador1:
    private Jugador jugador2:
    private Juez juez:
    private Juego juegoprevio1:
    private Juego juegoprevio2:
    private Juego juegosiguiente:
    private ArrayList<Set> sets;

    public Juego(Jugador jugador1, Jugador jugador2, Juez juez, Juego juegoprevio1, Juego juegoprevio2, Juego juegosiguiente, ArrayList<Set> sets) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.juez = juez;
        this.juegoprevio1 = juegoprevio1;
        this.juegoprevio2 = juegoprevio2;
        this.juegosiguiente = juegosiguiente;
        this.sets = sets;
    }
    
}
