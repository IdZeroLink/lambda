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

        Collections.sort(persons, (o1, o2) -> {
            int lenght1 = o1.getSurname().split("-").length;
            int lenght2 = o2.getSurname().split("-").length;
            if (lenght1 < lenght2) {
                return -1;
            }
            return o1.getAge() - o2.getAge();

        });


        for (Person person : persons) {
            System.out.println(person);
        }

        persons.forEach(System.out :: println);

    }
}