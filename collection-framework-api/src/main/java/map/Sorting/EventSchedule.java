package main.java.map.Sorting;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventSchedule {
    // Attributes
    private Map<LocalDate, Event> eventScheduleMap;

    // Constructor
    public EventSchedule() { this.eventScheduleMap = new HashMap<>(); }

    // Methods
    public void addEvent(LocalDate date, String name, String attraction) {
        eventScheduleMap.put(date, new Event(name, attraction));
    }

    public void showSchedule() {
        // The LocalDate class already implements the Comparator class
        // so by passing it, the TreeMap will be sorted by date automatically
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventScheduleMap);
        System.out.println(eventTreeMap);
    }

    public void showNextEvent() {
        LocalDate currentDate = LocalDate.now();
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventScheduleMap);

        for (Map.Entry<LocalDate, Event> entry : eventTreeMap.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                System.out.println("The next Event is "+entry.getValue()+" and will be on "+entry.getKey());
                break;
            }
        }
    }

    // PSVM
    public static void main(String[] args) {
        EventSchedule eventSchedule = new EventSchedule();

        eventSchedule.addEvent(LocalDate.of(2023, Month.JULY, 15), "Event 1", "Attraction 1");
        eventSchedule.addEvent(LocalDate.of(2023, Month.MAY, 01), "Event 2", "Attraction 2");
        eventSchedule.addEvent(LocalDate.of(2023, Month.JULY, 21), "Event 3", "Attraction 3");
        eventSchedule.addEvent(LocalDate.of(2023, Month.MAY, 02), "Event 4", "Attraction 4");
        eventSchedule.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 01), "Event 5", "Attraction 5");
        eventSchedule.addEvent(LocalDate.of(2023, Month.DECEMBER, 01), "Event 6", "Attraction 6");

        eventSchedule.showSchedule();
        eventSchedule.showNextEvent();

    }

}
