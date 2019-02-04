package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Programmer silvia = new Programmer("Silvia", new Date(), 1, Nationality.COSTA_RICAN, "Guate");
        Programmer bailin = new Programmer("Bailin", new Date(),1, Nationality.CHINESE, "China");

        System.out.println(bailin.morningGreet());
        System.out.println(bailin.greet());

        PersonComparator comparator = new PersonComparator();
        System.out.println(comparator.compare(silvia,bailin));
        System.out.println(bailin.equalName(silvia));
        System.out.println(bailin.equals(silvia));
        System.out.println(
                bailin.getStoryETA(10));
        if(silvia.equals(bailin)){
            System.out.println("Son iguales!");
        }
    }
}