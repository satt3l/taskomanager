import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskoManager {
    private ArrayList<Task> TasksList;

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        while(true){
            printMenu();
            reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine().trim();
            System.out.println("Input:" + input + "; length = " + input.length());
            switch (input) {
                case "1": createTask(new Task("Task", "Supa")); break;
                case "2": System.out.println("NOT IMPLEMENTED"); break;
                case "3": printTasks(); break;
                case "4": break;
            }
        }
    }
    public TaskoManager() {
        TasksList = new ArrayList<Task>();
    }
    public void printMenu() {
        System.out.println("1. Create task");
        System.out.println("2. Delete task");
        System.out.println("3. Print tasks");
        System.out.println("0. Exit");
    }

    public ArrayList<Task> getTasksList() {
        return TasksList;
    }
    public void createTask(Task task) {
        this.TasksList.add(task);
    }
    public void deleteTask(Task task) {
        this.TasksList.remove(task);
    }

    //public void
    public void printTasks(){
        for (Task task : this.TasksList) {
            System.out.println("Task name: " + task.getName());
            System.out.println("Task priority: " + task.getPriority());
            System.out.println("Task status: " + task.getStatus());
        }
    }
}
