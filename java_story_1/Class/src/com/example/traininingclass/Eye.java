package com.example.traininingclass;

public class Eye extends Organ{
    private String eyeColor;
    private Boolean Isclosed;

    public Eye(String organName, String organCondition, String eyeColor,Boolean Isclosed) {
        super(organName, organCondition);
        this.eyeColor = eyeColor;
        this.Isclosed =Isclosed;
    }

    public void getEyeColor(){
        System.out.println("Eye Color : " + eyeColor);

    }

    public void setEyeColor(String eyeColor) {

        this.eyeColor = eyeColor;
    }
}
