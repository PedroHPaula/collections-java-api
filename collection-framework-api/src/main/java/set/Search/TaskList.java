package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    // Attributes
    private Set<Task> taskList;

    // Constructor
    public TaskList() {
        this.taskList = new HashSet<>();
    }

    // Methods
    public void addTask(String description) {
        taskList.add(new Task(description, false));
    }

    public Task removeTask(String description) {
        Task removedTask = null;
        for (Task task : taskList) {
            if (task.getDescription().equals(description)) {
                removedTask = task;
                taskList.remove(task);
                break;
            }
        }

        return removedTask;
    }

    public void showTasks() {
        System.out.println(taskList);
    }

    public int countTasks() {
        return taskList.size();
    }

    public Set<Task> obtainCompletedTasks() {
        Set<Task> completedTasks = new HashSet<>();
        for (Task task : taskList) {
            if (task.isCompleted()) {
                completedTasks.add(task);
            }
        }

        return completedTasks;
    }

    public Set<Task> obtainPendingTasks() {
        Set<Task> pendingTasks = new HashSet<>();
        for (Task task : taskList) {
            if (!(task.isCompleted())) {
                pendingTasks.add(task);
            }
        }

        return pendingTasks;
    }

    public void checkTask(String description) {
        for (Task task : taskList) {
            if (task.getDescription().equals(description)) {
                task.setCompleted(true);
                break;
            }
        }
    }

    public void uncheckTask(String description) {
        for (Task task : taskList) {
            if (task.getDescription().equals(description)) {
                task.setCompleted(false);
                break;
            }
        }
    }

    public void clearAllTasks() {
        taskList.removeAll(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Learn C");
        taskList.addTask("Learn C");
        taskList.addTask("Learn Python");
        taskList.addTask("Learn Java");
        taskList.addTask("Eat");
        taskList.addTask("Sleep");
        taskList.addTask("Sleep");
        taskList.addTask("Code");

        taskList.checkTask("Eat");
        taskList.checkTask("Sleep");
        taskList.showTasks();

        System.out.println(taskList.obtainCompletedTasks());
        System.out.println(taskList.obtainPendingTasks());

        taskList.clearAllTasks();
        taskList.showTasks();

    }
}
