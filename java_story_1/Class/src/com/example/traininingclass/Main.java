package com.example.traininingclass;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public Boolean isFinsihed;
    public static void main (String[] args){
        Patient patient=new Patient ("Rohit",32);
        Eye L_eye=new Eye ("Left Eye","Normal","Blue",true);
        Eye R_eye= new Eye ("Right Eye", "Defective", "Green",true);
        Heart heart=new Heart ("Heart","Normal",110);
        Skin skin = new Skin ("Skin","Dry",24);
        Stomach stomach = new Stomach ("Stomach", "Famished",false);

        Boolean isFinsihed=false;

        patient.getPatientDetails();

        while(isFinsihed!=true) {
            System.out.println("Choose an organ : \n" +
                    "1. Left Eye\n" +
                    "2. Right Eye\n" +
                    "3.Heart\n" +
                    "4.Stomach\n" +
                    "5.Skin\n" +
                    "6. Quit");

            Scanner userInput = new Scanner(System.in);
            Integer userChoice = userInput.nextInt();


            switch (userChoice) {
                case(1):
                    L_eye.getDetails();
                    L_eye.getEyeColor();
                    if (L_eye.Isclosed()==false) {
                        System.out.println("1. Close the eye \n");
                        userChoice = userInput.nextInt();
                        if (userChoice == 1) {
                            L_eye.setEyeclosed();
                            System.out.println("eye closed \n");
                            continue;
                        } else {
                            continue;
                        }
                    }
                    else {
                            System.out.println("1. open the eye \n");
                            userChoice= userInput.nextInt();
                            if (userChoice==1){
                                L_eye.setEyeopen();
                                System.out.println("eye open \n");
                                continue;
                            }
                            else{
                            continue;
                            }
                        }



                case (2):
                    R_eye.getDetails();
                    R_eye.getEyeColor();
                    System.out.println("1. Close the eye \n");
                    userChoice= userInput.nextInt();
                    if (userChoice==1){
                        System.out.println("eye closed \n");
                        continue;
                    }
                    else{
                        continue;
                    }

                case (3):
                    heart.getDetails();
                    heart.getHeartRate();
                    System.out.println("1. Set heart rate \n");
                     userChoice= userInput.nextInt();
                    if (userChoice==1){
                        System.out.println("Enter heart Rate : \n");
                        Integer userChoiceHeartRate= userInput.nextInt();
                        heart.setHeartRate(userChoiceHeartRate);
                        heart.getHeartRate();
                        continue;
                    }

                    else{
                        continue;
                    }

                case (4):
                    stomach.getDetails();
                    stomach.getIsfed();
                    System.out.println("1. feed patient \n");
                    userChoice= userInput.nextInt();
                    if (userChoice==1){
                        System.out.println("Force Feeding Patient");
                        stomach.setIsFed(true);
                        stomach.setOrganCondition("Satiated");
                        stomach.getDetails();
                        continue;
                    }

                    else{
                        continue;
                    }

                case (5):
                    skin.getDetails();
                    skin.getSkinCoeff();
                    System.out.println("1.Set Skin Coefficient\n");
                    userChoice= userInput.nextInt();
                    if (userChoice==1){
                        System.out.println("Enter Skin Coefficient\n");
                        userChoice= userInput.nextInt();
                        skin.setSkinCoeff(userChoice);
                        skin.setOrganCondition("moist");
                        skin.getSkinCoeff();
                        skin.getOrganCondition();
                        continue;
                    }

                    else{
                        continue;
                    }


                default:
                    isFinsihed = true;
                    System.out.println("Diagnosis terminated");
                    break;



            }


        }




    }
}



/**patient.getPatientDetails();
 L_eye.getDetails();
 L_eye.getEyeColor();
 R_eye.getDetails();
 skin.getSkinCoeff();
 skin.setSkinCoeff(100);
 skin.getSkinCoeff();
 stomach.getIsfed();
 stomach.getIsfed();
 stomach.getOrganCondition();
 stomach.setIsFed(true);
 stomach.getIsfed();
 stomach.setOrganCondition("Normal");
 stomach.getOrganCondition();**/