package com.company;
import java.util.Scanner;


public class App
{


    public static String effectiveDevice(fitnessgeraet g1, fitnessgeraet g2)
    {
        if(g1.calorieburn(60)>g2.calorieburn(60))
        {

            return g1.getName();
        }
        else
        {
            return g2.getName();
        }
    }

    public static void main(String[] args)
    {

        muskelgruppe  ObererRuecken = new muskelgruppe("Oberer Ruecken", 3);
        muskelgruppe Arme = new muskelgruppe("Arme", 2);
        //muskelgruppe Beine = new muskelgruppe("Beine", 3);


        fitnessgeraet curls = new fitnessgeraet("Curls", "Krafttraining", Arme, 10, 400, false);
        //fitnessgeraet stepper = new fitnessgeraet("Stepper", "Cardio", Beine, 60, 300, true);
        fitnessgeraet rueckentrainer = new fitnessgeraet("Rueckentrainer" , "Oberer Ruecken", ObererRuecken, 100, 500, false);

        trainingseinheit a = new trainingseinheit(15, 2018 , 10,1,2,3,rueckentrainer);

    /*    ObererRuecken.setMuscles();
        System.out.print(ObererRuecken.getMusclename());
        System.out.println("\n");
        ObererRuecken.getMuscles();
        a.minTraining(500);
        rueckentrainer.calorieburn(10);
        rueckentrainer.calorieburn(10, 1);
        rueckentrainer.support("");
        rueckentrainer.support(ObererRuecken);
        rueckentrainer.needElectricity();
*/

        System.out.println("Das effektivere Geraet hat den Namen "+ effectiveDevice(curls, rueckentrainer));
     //   a.goalAchieved(500);
    }

    public void enterMuscles(int a)
    {

    }

}
