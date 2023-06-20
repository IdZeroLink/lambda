import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons =new ArrayList<>();
        persons.add(new Person("Mikhail", "Lermontov", 26));
        persons.add(new Person("Alexander", "Pushkin", 37));
        persons.add(new Person("Fedor", "Dostoevsky", 59));
        persons.add(new Person("Leo", "Tolstoy", 82));
        persons.add(new Person("Ivan", "Bunin", 83));
        Collections.sort(persons, new PersonComparator());

    }
}