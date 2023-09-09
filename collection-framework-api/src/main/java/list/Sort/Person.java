package main.java.list.Sort;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    // Attributes
    private String name;
    private int age;
    private double height;
    
    // Constructor
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    // Print template
    @Override
    public String toString() {
        return "Person{"+name+", "+age+", "+height+"}";
    }

    // Comparable method
    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, person.getAge());
    }
    
}

class ComparatorByHeight implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Double.compare(person1.getHeight(), person2.getHeight());
    }
    
}
