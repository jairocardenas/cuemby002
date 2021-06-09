package com.cuemby.demo.core.db;

import com.cuemby.demo.core.models.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerDB {

    public List<Player> players = Arrays.asList(
            new Player(1, "Jairo", "Delantero", "colombiano", "Colombia"),
            new Player(1, "Chritopher", "Portero", "colombiano", "Colombia"),
            new Player(1, "Sergio", "Delantero", "colombiano", "Colombia"),
            new Player(1, "Lorena", "Portero", "colombiano", "Colombia")

    );

}
