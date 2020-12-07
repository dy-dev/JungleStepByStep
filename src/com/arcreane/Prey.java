package com.arcreane;

public class Prey {
    static int s_iMaxAge = 80;

    int m_iAge;
    int m_iVigor;
    int m_iLifePoint;
    float m_fOrientation;

    public Prey() {
        this(30, 50, 27);
    }

    public Prey(int p_iAge, int p_iVigor, int p_iLifePoint) {
        m_iAge = p_iAge;
        m_iVigor = p_iVigor;
        m_iLifePoint = p_iLifePoint;
    }

    //Quand on aura créé les plantes on pourra ajouter une variable
    //membre de type plante représentant la plante repérée par la proie
    void move() {

    }

    void searchForFood() {
        System.out.println("J'ai faim je cherche à manger, il me reste : " + m_iVigor);
    }

    void eat() {
        //Utilisation de la variable de type plante
        System.out.println("J'ai mangé j'ai : " + m_iLifePoint +
                "points de vie, mon age est : " + m_iAge +
                " ans, il me reste : " + m_iVigor + " points de vigueur");
    }

    void drink() {

    }

    void rest() {
        System.out.println("Mon age : " + this.m_iAge + " ans, " +
                "L'age max de mon espèce : " + Prey.s_iMaxAge + " ans");
    }

    Prey mate(Prey p_Prey) {
        int lifePoint = m_iLifePoint;
        int vigor = p_Prey.m_iVigor;
        int age = (m_iAge + p_Prey.m_iAge) / 2;

        return new Prey(age, vigor, lifePoint);
    }

}
