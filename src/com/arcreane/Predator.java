package com.arcreane;

public class Predator {
    static int s_iMaxAge;
    int m_iAge;
    int m_iVigor;
    int m_iLifePoint;
    float m_fOrientation;

    Prey m_Prey;

    public Predator(){
        /*m_iAge = 60;
        m_iVigor = 20;
        m_iLifePoint = 50;*/
        this(60,20,50);
    }

    public Predator(int p_iAge, int p_iVigor, int p_iLifePoint) {
        m_iAge = p_iAge;
        m_iVigor = p_iVigor;
        m_iLifePoint = p_iLifePoint;
    }

    void move(){

    }

    void hunt(){
        //Use m_Prey
    }

    void eat(){
       //Use m_Prey
        m_Prey = null;
    }

    void drink(){

    }

    void rest(){

    }

    Predator mate(Predator p_Predator){
        int age = (m_iAge + p_Predator.m_iAge) / 2;
        int vigor = (m_iVigor + p_Predator.m_iVigor) / 2;
        int lifepoint = (m_iLifePoint + p_Predator.m_iLifePoint) / 2;

        return new Predator(age, vigor, lifepoint);
    }
}
