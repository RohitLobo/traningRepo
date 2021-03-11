package com.example.traininingclass;

public class Eye extends Organ {
    private String eyeColor;
    private Boolean Isclosed;

    public Eye(String organName, String organCondition, String eyeColor, Boolean Isclosed) {
        super(organName, organCondition);
        this.eyeColor = eyeColor;
        this.Isclosed = Isclosed;
    }

    public void getEyeColor() {
        System.out.println("Eye Color : " + eyeColor);

    }

    public Boolean Isclosed(){
        return Isclosed;
    }



    public void setEyeclosed() {
        this.Isclosed = true;

    }

    public void setEyeopen() {
        this.Isclosed = false;
    }
}