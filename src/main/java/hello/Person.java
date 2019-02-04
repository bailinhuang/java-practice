package hello;
import java.util.Date;

public abstract class Person implements Greeting{
    String name;
    Date birthdate;
    int id;

    public Person(){}

    public Person(String name, Date birthdate, int id){
        this.name = name;
        this.birthdate = birthdate;
        this.id = id;
    }
    @Override
    public String greet(String greeting){
        return greeting;
    }

    @Override
    public String morningGreet(String greeting){
        return greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
