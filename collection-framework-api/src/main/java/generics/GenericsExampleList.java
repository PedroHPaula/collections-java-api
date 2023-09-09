package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) throws Exception {
        // Example without Generics
        List listWithoutGenerics = new ArrayList();
        listWithoutGenerics.add("Element 1");
        listWithoutGenerics.add(10);

        // Example with Generics
        List<String> genericsList = new ArrayList<>();
        genericsList.add("Element 1");
        genericsList.add("Element 2");

        // Iterating over the list without Generics
        for (Object element : listWithoutGenerics) {
            String str = element.toString();
            System.out.println(str);
        }

        // Iterating over the list with Generics
        for (String element : genericsList) {
            System.out.println(element);
        }
    }
}
