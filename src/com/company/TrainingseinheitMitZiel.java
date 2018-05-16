package com.company;

public class TrainingseinheitMitZiel extends trainingseinheit implements Trainingsziel
{
    private int calorieGoal;
    private int year,month,day,hour,minute;
    private fitnessgeraet fitnessdevice;

    public TrainingseinheitMitZiel(int duration, int year, int month, int day, int hour, int minute, fitnessgeraet fitnessdevice, int calorieGoal)
    {
        super(15,2018,4,12,10,15,fitnessdevice);
        this.calorieGoal = calorieGoal;
    }

    public void train(int min)
    {
        if(getGoalProgress()<1)
        {
            super.train(min);
        }
        else
        {
            System.out.println("Hurra");
        }
    }

    public void setCalorieGoal(int calorieGoal)
    {
        this.calorieGoal = calorieGoal;

    }

    public int getCalorieGoal()
    {
        return this.calorieGoal;
    }

    public double getGoalProgress()
    {

        double progress = (fitnessdevice.calorieburn(this.minute))/getCalorieGoal();

        return progress;
    }
}