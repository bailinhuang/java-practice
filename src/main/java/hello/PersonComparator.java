package hello;

import java.util.Comparator;


public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getBirthdate() != person2.getBirthdate()){
            return -1;
        }
        return 0;
    }
}
