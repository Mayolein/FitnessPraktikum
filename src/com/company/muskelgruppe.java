package com.company;
import java.util.Scanner;

public class muskelgruppe {
    private String musclename;
    private int numberofmuscles;
    private String muscles[];
    private String submuscle;

    public muskelgruppe(String musclename, int numberofmuscles )
    {
        this.musclename = musclename;
        this.numberofmuscles=numberofmuscles;
        this.muscles = new String[numberofmuscles] ;
    }

    public boolean containsMuscle(String muscle)
    {
       for(int i=0; i< numberofmuscles; i++)
       {
           if(muscle.equals(this.muscles[i]))
           {
               return true;
           }
       }
       return false;

    }

    public String getMusclename()
    {

        return musclename;
    }

    public int getMuscles()
    {
        for (int i = 0; i < numberofmuscles; i++)
        {
            System.out.print("Muskel: "+this.muscles[i]+"\n");
        }
        return 0;
    }

    public void setMuscles()
    {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<numberofmuscles; i++)
        {
        System.out.print("Geben Sie ihren "+(i+1)+" Untermuskel ein.");
        submuscle = in.next();

            this.muscles[i] = submuscle;
        }
    }
}

