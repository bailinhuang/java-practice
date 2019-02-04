package hello;

import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class Programmer extends Citizen{

    private static final long coffeePerHour = 2;

    public Programmer(String name, Date birthdate, int id, Nationality nationality, String birthplace){
        super(name, birthdate, id, nationality, birthplace);
    }

    public String getStoryETA(long cupsOfCoffee){
        return this.estimateStoryPoint(cupsOfCoffee);
    }

    private String estimateStoryPoint(long cupsOfCoffee){
        long hours = 20;
        hours -= cupsOfCoffee*coffeePerHour - this.energyBoost();
        LocalTime presentTime = LocalTime.now();
        LocalTime futureTime = LocalTime.now();
        futureTime = futureTime.plusHours(hours);
        String message = "Right now: " + presentTime.toString() + " ETA: " + futureTime.toString();
        return message;
    }
}
