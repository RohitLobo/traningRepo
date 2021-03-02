package com.example.traininingclass;

public class Stomach extends Organ{
    private Boolean isFed;


    public Stomach(String organName, String organCondition, Boolean isFed) {
        super(organName, organCondition);
        this.isFed=isFed;
    }


    public void getIsfed(){
        System.out.println("Patient is fed : " + isFed);
    }

    public void setIsFed(Boolean isFed){
        this.isFed=isFed;

    }


}
