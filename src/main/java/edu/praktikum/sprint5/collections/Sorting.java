package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Proton;
import edu.praktikum.sprint5.models.Soyuz;
import edu.praktikum.sprint5.models.SpaceShip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("cccc00");
        list.add("bbbb");

        System.out.println("Несортированный: " + list);

        Collections.sort(list);

        System.out.println("Сортированный: " + list);


        Soyuz soyuz = new Soyuz(3);
        Soyuz soyuz2 = new Soyuz(5);
        Proton proton = new Proton(4);
        Soyuz soyuz3 = new Soyuz(3);

        List<SpaceShip> ships = new ArrayList<>();
        ships.add(soyuz);
        ships.add(soyuz2);
        ships.add(proton);
        ships.add(soyuz3);

        Collections.sort(ships);

        System.out.println(ships);
    }
}
