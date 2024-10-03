package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Soyuz;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Maps {

    public static void main(String[] args) {
        Soyuz soyuz1 = new Soyuz(2);
        Soyuz soyuz2 = new Soyuz(2);

        System.out.println(Objects.equals(soyuz1, soyuz2));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(3, "три");
        map.put(2, "два");

        System.out.println(map);

        Map<Soyuz, Integer> shipMap = new HashMap<>();
        shipMap.put(new Soyuz(3), 5);
        shipMap.put(new Soyuz(2), 10);


        Map<Soyuz, String> mapShipsToText = new HashMap<>();
        mapShipsToText.put(soyuz1, "Первый");
        mapShipsToText.put(soyuz2, "Второй");

        System.out.println(mapShipsToText);
    }
}
