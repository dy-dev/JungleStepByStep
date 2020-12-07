package com.arcreane;

public class Prey {
    static int s_iMaxAge;

    int m_iAge;
    int m_iVigor;
    int m_iLifePoint;
    float m_fOrientation;

    public Prey(){
        this(30,50,27);
    }

    public Prey(int p_iAge, int p_iVigor, int p_iLifePoint) {
        m_iAge = p_iAge;
        m_iVigor = p_iVigor;
        m_iLifePoint = p_iLifePoint;
    }

    //Quand on aura créé les plantes on pourra ajouter une variable
    //membre de type plante représentant la plante repérée par la proie
    void move(){

    }

    void searchForFood(){
        System.out.println("J'ai faim je cherche à manger, il me reste : " + m_iVigor);
    }

    void eat(){
//Utilisation de la variable de type plante
    }

    void drink(){

    }

    void rest(){

    }

    void mate(Prey p_Prey){

    }

}
