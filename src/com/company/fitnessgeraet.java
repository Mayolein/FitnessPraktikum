package com.company;

public class fitnessgeraet
{
    private String name;
    private String type;
    private muskelgruppe musclegroup;
    private int MaxDur;
    private int calories;
    public double burned;
    private boolean electricity;

    public fitnessgeraet(String name, String type, muskelgruppe musclegroup, int maxDur, int calories, boolean electricity)
    {
        this.name = name;
        this.type = type;
        this.musclegroup = musclegroup;
        this.MaxDur = maxDur;
        this.calories = calories;
        this.electricity = electricity;
    }
    public String getName()
    {
        return this.name;
    }

    public double calorieburn(double minutes)
    {
        burned = (minutes/60)*calories;
        return burned;
    }


    public double calorieburn(double minutes, int hours)
    {
        burned = ((minutes/60)*calories)+(hours*calories);
        return burned;
    }

    public boolean support(String muscle)
    {
        if(musclegroup.containsMuscle(muscle))
        {
            return true;
        }
        else
        {
            System.exit(1);
            return false;
        }
    }

    public boolean support(muskelgruppe muskelGruppe)
    {
        if(musclegroup== muskelGruppe)
        {
            return true;
        }
        else
        {
            System.exit(1);
            return false;
        }
    }
    

    public boolean needElectricity()
    {
        if(electricity)
        {
            System.out.println("\nDas Geraet benoetigt Strom.\n");
            return true;
        }
        else
            System.out.println("\nDas Geraet benoetigt keinen Strom\n");
            return false;
    }
}