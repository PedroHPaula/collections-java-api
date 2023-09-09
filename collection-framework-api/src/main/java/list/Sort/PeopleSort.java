package main.java.list.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleSort {
    // Attributes
    private List<Person> peopleList;

    // Constructor
    public PeopleSort() {
        this.peopleList = new ArrayList<>();
    }

    // Methods
    public void addPerson(String name, int age, double height) {
        peopleList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }

    public static void main(String[] args) {
        PeopleSort peopleList = new PeopleSort();
        peopleList.addPerson("Mary", 17, 1.65);
        peopleList.addPerson("Rose", 19, 1.63);
        peopleList.addPerson("Andrew", 21, 1.85);
        peopleList.addPerson("Ross", 20, 1.72);

        System.out.println(peopleList.peopleList);
        System.out.println(peopleList.sortByAge());
        System.out.println(peopleList.sortByHeight());
    }
}
