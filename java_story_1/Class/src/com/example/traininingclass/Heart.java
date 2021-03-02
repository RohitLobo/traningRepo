package com.example.traininingclass;

public class Heart extends Organ {
    private Integer heartRate;

    public Heart(String organName, String organCondition, Integer heartRate) {
        super(organName, organCondition);
        this.heartRate = heartRate;
    }

    public void setHeartRate(Integer heartRate){
            this.heartRate=heartRate;
    }

    public void getHeartRate(){
        System.out.println( "Heart rate :" + heartRate);
    }



}
