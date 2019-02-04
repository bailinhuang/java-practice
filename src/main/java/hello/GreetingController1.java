package hello;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController1 {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private ArrayList<Programmer> programmerList = new ArrayList<>();

    @RequestMapping("/greeting")
    public Greeting1 greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting1(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/programmer")
    public Programmer programmer(@RequestParam(value = "name", defaultValue = "programmer") String name,
                                 @RequestParam(value = "birthplace") String birthplace,
                                 @RequestParam(value = "nationality") int nationality){
        Nationality enumNationality;
        switch (nationality){
            case 1:
                enumNationality = Nationality.COSTA_RICAN;
                break;
            case 2:
                enumNationality = Nationality.CHINESE;
                break;
            case 3:
                enumNationality = Nationality.MEXICAN;
                break;
            default:
                enumNationality = Nationality.COSTA_RICAN;
                break;
        }
        Long index = counter.incrementAndGet();
        int id = index.intValue();
        Programmer programmer = new Programmer(name, new Date(), id , enumNationality, birthplace);
        programmerList.add(programmer);
        return programmer;
    }

    @RequestMapping("/greeting/programmer/{id}")
    public String getProgrammerGreeting(@PathVariable int id){
        return programmerList.get(id).greet();
    }

    @RequestMapping("/programmer/ETA/{id}")
    public String getProgrammerGreeting(@PathVariable int id,
                                        @RequestParam(value = "cups", defaultValue = "5") long cups){
        return programmerList.get(id).getStoryETA(cups);
    }

}