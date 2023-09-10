package main.java.set.Search;

import java.util.Objects;

public class Task {
    // Attributes
    private String description;
    private boolean completed;

    // Constructor
    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    // Setters
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Inherited methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Task)) return false;
        Task task = (Task) obj;
        return getDescription() == task.getDescription();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    @Override
    public String toString() {
        return "Task{"+description+", ("+(completed ? "X" : " ")+")}";
    }

}
