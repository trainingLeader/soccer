package com.soccer;

import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class Main {
    public static void main(String[] args) {
        Controller ctrlTeams = new Controller();
        Team equipo = new Team();

        equipo.setNombre("Bucaros");
        equipo.setCiudad("Bucaramanga");
        Player jugador = new Player(1,"Pepito","XXXX",23,12,"Medio");
        equipo.setLstJugadores(jugador);

        ctrlTeams.equipos.put("001", equipo);

        equipo = ctrlTeams.equipos.get("001");
        System.out.println("Mi equipo" + equipo.getNombre());
        System.out.println("Jugador"+ equipo.getLstJugadores().get(0).getNombre());
    }
}