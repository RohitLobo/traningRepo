package com.example.traininingclass;

public class Skin extends Organ{
    private Integer skinCoeff;

    public Skin(String organName, String organCondition, Integer skinCoeff) {
        super(organName, organCondition);
        this.skinCoeff = skinCoeff;
    }

    public void setSkinCoeff(Integer skinCoeff){
            this.skinCoeff=skinCoeff;
    }

    public void getSkinCoeff(){
        System.out.println( "Skin Coefficient : " + skinCoeff);
    }


}


