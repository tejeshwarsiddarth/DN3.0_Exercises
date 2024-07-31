public class Main {
    public static void main(String[] args) {
        // Create a TaskLinkedList instance
        TaskLinkedList taskList = new TaskLinkedList();

        // Create and add tasks
        Task task1 = new Task(1, "Complete Homework", "Pending");
        Task task2 = new Task(2, "Grocery Shopping", "Completed");
        Task task3 = new Task(3, "Read a Book", "Pending");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Display all tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();

        // Search for a task
        int searchId = 2;
        Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("\nFound Task:");
            System.out.println(foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete a task
        int deleteId = 1;
        boolean isDeleted = taskList.deleteTask(deleteId);
        if (isDeleted) {
            System.out.println("\nTask with ID " + deleteId + " was deleted.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found for deletion.");
        }

        // Display all tasks after deletion
        System.out.println("\nAll tasks after deletion:");
        taskList.traverseTasks();
    }
}
