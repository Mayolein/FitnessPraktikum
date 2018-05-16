import com.company.fitnessgeraet;
import com.company.trainingseinheit;

public class TrainingseinheitMitZiel extends trainingseinheit implements Trainingsziel
{
    int calorieGoal;

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
        return calorieGoal;
    }

    public double getGoalProgress()
    {
        double progress = (fitnessdevice.calorieburn(this.min))/getCalorieGoal();

        return progress;
    }
}
