package hello;
import hello.Nationality;

import java.util.Date;

public class Citizen extends Person{

    Nationality nationality;
    String birthplace;

    public Citizen(){
    }

    public Citizen(String name, Date birthdate, int id, Nationality nationality){
        super(name, birthdate, id);
        this.nationality = nationality;
    }

    public Citizen(String name , Date birthdate, int id, Nationality nationality, String birthplace){
        super(name,birthdate,id);
        this.nationality = nationality;
        this.birthplace = birthplace;
    }

    public String greet(Nationality greeting){

        StringBuilder message = new StringBuilder();
        switch (greeting){
            case COSTA_RICAN:
                message.append("Pura vida");
                break;
            case CHINESE:
                message.append("大家好");
                break;
            case MEXICAN:
                message.append("orale!");
                break;
            default:
                message.append("holi");
                break;
        }
        return message.toString();
    }

    public String morningGreet(Nationality greeting){

        StringBuilder message = new StringBuilder();

        switch (greeting){
            case COSTA_RICAN:
                message.append("Buenos dias pura vida");
                break;
            case CHINESE:
                message.append("早上好");
                break;
            case MEXICAN:
                message.append("buen dia wey!");
                break;
            default:
                message.append("Buenos dias");
                break;
        }
        return message.toString();

    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
