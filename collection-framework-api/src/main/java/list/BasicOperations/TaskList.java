package main.java.list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    // Attribute
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }

        taskList.removeAll(tasksToRemove);
    }

    public int totalNumberOfTasks() {
        return taskList.size();
    }

    public void printTaskDescriptions() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println(taskList.totalNumberOfTasks());
        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        System.out.println(taskList.totalNumberOfTasks());

        taskList.removeTask("Task 1");
        System.out.println(taskList.totalNumberOfTasks());

        taskList.printTaskDescriptions();
    }
}
