import java.util.ArrayList;
import java.util.Scanner;

public class Task {

    static ArrayList<String> tasks = new ArrayList<String>();

    static Scanner s1 = new Scanner(System.in);

    public static void main(String args[]) {

        while (true) {
            displayMenu();
            int choice = s1.nextInt();
            s1.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTask();
                    break;

                case 3:
                    markTaskComplete();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice. Please try again!");
            }
        }
    }

    // Menu
    public static void displayMenu() {
        System.out.println("\n--- TO DO LIST MENU ---");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Add task
    public static void addTask() {
        System.out.print("Enter a task: ");
        String task = s1.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // View tasks
    public static void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("No Task Available");
            return;
        }

        System.out.println("\n-- Your Tasks --");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Mark task complete
    public static void markTaskComplete() {
        if (tasks.isEmpty()) {
            System.out.println("No Task Available");
            return;
        }

        viewTask();
        System.out.print("Enter task number to mark as completed: ");
        int taskNumber = s1.nextInt();
        s1.nextLine();

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid Task Number.");
        } else {
            String completedTask = tasks.get(taskNumber - 1) + " [Completed]";
            tasks.set(taskNumber - 1, completedTask);
            System.out.println("Task marked as completed ?");
        }
    }

    // Delete task
    public static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("No Task Available");
            return;
        }

        viewTask();
        System.out.print("Enter task number to delete: ");
        int taskNumber = s1.nextInt();
        s1.nextLine();

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid Task Number.");
        } else {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully ?");
        }
    }
}
