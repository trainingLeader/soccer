package com.soccer;

import com.soccer.view.viewTeam;

public class Main {
    public static void main(String[] args) {
        Controller ctrlTeams = new Controller();
        viewTeam.controlador = ctrlTeams;
        viewTeam vt = new viewTeam();
        vt.start();


       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}