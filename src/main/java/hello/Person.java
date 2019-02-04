package hello;
import java.util.Date;
import java.util.Random;

public abstract class Person implements Greeting{
    protected String name;
    protected Date birthdate;
    protected int id;

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

    protected long energyBoost(){
        return new Random().nextLong();
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(this.id == person.id){
            return true;
        } else {
            return false;
        }
    }

    public int equalName(Person person){
        if(this.name.equals(person.getName())){
            return 0;
        }
        else {
            return -1;
        }
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
