package edu.praktikum.sprint5.collections;

import edu.praktikum.sprint5.models.Proton;
import edu.praktikum.sprint5.models.Soyuz;
import edu.praktikum.sprint5.models.SpaceShip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        Soyuz soyuz = new Soyuz(3);
        Proton proton = new Proton(0);

        List<SpaceShip> arrayShips = new ArrayList<>();
        arrayShips.add(soyuz);
        arrayShips.add(proton);

        /*
        Внутри ArrayList массив, размер которого увеличивается при необходимости

        [    ] -> [       ] -> [             ]
        [ "a",  "zxy", "abc" ]
        [ "a",  "b", "zxy", "abc" ]

        Pros: быстрое чтение элементов, так как к ним можно получить доступ по индексу
        Cons: долгое добавление и удаление элементов, так как необходимо каждый раз сдвигать все последующие элементы
         */

        List<SpaceShip> linkedShips = new LinkedList<>();
        linkedShips.add(soyuz);
        linkedShips.add(proton);

        /*
        Внутри LinkedList ноды, каждая хранит значение элемента и ссылки на предыдущую и следующую ноду

        ("a")-> <-("zxy")-> <-("abc")
        ("a")-> <-("b")-> <-("zxy")-> <-("abc")

        Pros: быстрое добавление и удаление элементов, так как нужно только добавить ноду
        и изменить ссылки у соседних нод
        Cons: долгое чтение элементов, так как каждый раз вычитывание происходит с начала списка,
        пока по ссылкам не дойдет до нужного элемента
         */

        System.out.println(arrayShips);
        System.out.println(linkedShips);
    }
}
