/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ligatenis;

import core.persona.Juez;
import core.persona.Jugador;
import java.util.ArrayList;

/**
 *
 * @author mafer
 */
public class LigaTenis {
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;

    public LigaTenis(ArrayList campeonatos, ArrayList jueces, ArrayList jugadores) {
        this.campeonatos = campeonatos;
        this.jueces = jueces;
        this.jugadores = jugadores;
    }
    
}
