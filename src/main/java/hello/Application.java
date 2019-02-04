package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        Programmer silvia = new Programmer("Silvia", new Date(), 1, Nationality.COSTA_RICAN, "Guate");
        Programmer bailin = new Programmer("Bailin", new Date(),1, Nationality.CHINESE, "China");

        System.out.print(bailin.greet(bailin.getNationality()));
        PersonComparator comparator = new PersonComparator();
        System.out.print(comparator.compare(silvia,bailin));

    }
}