package com.example.traininingclass;

public class Organ {
    String organName;
    String organCondition;

    /* Constructor*/

    public  Organ(String organName, String organCondition){
            this.organName=organName;
            this.organCondition=organCondition;

    }

    public void getDetails(){
        System.out.println("Organ Name : " + this.organName);
        System.out.println("Organ Condition : " +this.organCondition);

    }


    /*Getter and setter*/
    public String getOrganName(){
            return organName;

    }

    public String getOrganCondition(){
        System.out.println(organCondition);
        return organCondition;
        }


    public void setOrganName(String organName) {
            this.organName=organName;

    }

    public void setOrganCondition(String organCondition) {
        this.organCondition=organCondition;
    }


}
