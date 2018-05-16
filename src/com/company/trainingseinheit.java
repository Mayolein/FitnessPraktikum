package com.company;

public class trainingseinheit {

    private int duration=0;
    private int year,month,day,hour,minute;
    private fitnessgeraet fitnessdevice;


    public trainingseinheit(fitnessgeraet fitnessdevice)
    {
        this.fitnessdevice = fitnessdevice;
    }

    public trainingseinheit(int duration, int year, int month, int day, int hour, int minute, fitnessgeraet fitnessdevice) {
        this.duration = duration;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.fitnessdevice = fitnessdevice;
    }


    public boolean goalAchieved(int caloriegoal)
    {
        //with duration of training and the average burn of calories per device
        while(fitnessdevice.calorieburn(this.duration)<caloriegoal)
        {
            System.out.print("\nWeiter trainieren");
            train(5);
        }
        System.out.println("\nEs wurden "+fitnessdevice.calorieburn(this.duration)+" Kalorien verbraucht");

        return true;
    }


    public void minTraining(int caloriegoal)
    {
        double a = fitnessdevice.calorieburn(70.0);
        double min = caloriegoal/a;
        System.out.println("Die mindest Trainingsdauer betraegt "+min +" Stunden");
    }

    public void train()

    {
        this.duration ++;
    }

    public void train(int minutes)
    {
        this.duration = this.duration+minutes;
    }
}