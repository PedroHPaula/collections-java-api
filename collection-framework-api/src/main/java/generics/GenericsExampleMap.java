package main.java.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
    public static void main(String[] args) {
        // Example without Generics
        Map mapWithoutGenerics = new HashMap();
        mapWithoutGenerics.put("Key 1", 10);
        mapWithoutGenerics.put("Key 2", "Value");

        // Example with Generics
        Map<String, Integer> genericsMap = new HashMap<>();
        genericsMap.put("Key 1", 10);
        genericsMap.put("Key 2", 20);

        // Iterating over the map without Generics
        for (Object obj : mapWithoutGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String key = entry.getKey().toString();
            Object value = entry.getValue();
            System.out.println("{Key: Value} - {"+key+", "+value+"}");
        }

        // Iterating over the map with Generics
        for (Map.Entry<String, Integer> entry : genericsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("{Key: Value} - {"+key+", "+value+"}");
        }
    }
}
