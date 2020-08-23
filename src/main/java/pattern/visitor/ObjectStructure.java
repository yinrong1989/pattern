package pattern.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> people = new LinkedList<>();


    public  void attach(Person p){
        people.add(p);

    }
    public void detach(Person p){
        people.remove(p);
    }
    public  void display(Action action){
        people.forEach(person -> {
            person.accept(action);
        });


    }
}
