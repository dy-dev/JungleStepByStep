package com.arcreane;

public class Jungle {

    public static void main(String[] args) {
        int[] intArray = new int[5];
        Predator[] predArray = new Predator[5];
        for (int i = 0; i < predArray.length ; i++) {
            predArray[i] = new Predator((int) (Math.random() * 100),
                    (int) (Math.random() * 100),
                    (int) (Math.random() * 100));
        }

        Predator predator = new Predator();
        Predator predator2 = new Predator(90,35,42);

        Predator newBorn = predator.mate(predator2);

        Prey prey = new Prey();
        Prey prey2 = new Prey(60,57,29);

        Prey newBornPrey = prey.mate(prey2);
        Prey newBornPrey2 = prey2.mate(prey);

//        prey.eat();
//        prey2.eat();
//        newBornPrey.eat();
//        newBornPrey2.eat();
//
        prey.rest();
        prey2.rest();

        Prey.s_iMaxAge = 70;

        prey.rest();
        prey2.rest();

        int age = prey.m_iAge;
    }


}
