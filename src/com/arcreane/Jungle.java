package com.arcreane;

public class Jungle {

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator2 = new Predator(90,35,42);

        Predator newBorn = predator.mate(predator2);

        Prey prey = new Prey();
        Prey prey2 = new Prey(60,57,29);

        prey.searchForFood();
        prey2.searchForFood();
    }


}
