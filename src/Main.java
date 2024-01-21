import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> ArrayListOfP = new ArrayList<>();


        Employee softer = new Employee("Assylzhan", "Kurmanbek", "webdeveloper", 320000);
        Student aki = new Student("Akezhan", "Nurzhan", 3.14);
        Employee abu = new Employee("Abu", "Nariman", "reserch assistant", 230000);
        Student emely = new Student("Emely", "Branston", 2.41);


        ArrayListOfP.add(softer);
        ArrayListOfP.add(aki);
        ArrayListOfP.add(abu);
        ArrayListOfP.add(emely);

        Collections.sort(ArrayListOfP);
        printData(ArrayListOfP);
    }
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount());
        }


    }


}