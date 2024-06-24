import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    private ArrayList<String> tasks;

    public Todo() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Todo app = new Todo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple To-Do List App");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    app.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    app.removeTask(removeIndex);
                    break;
                case 3:
                    app.listTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
