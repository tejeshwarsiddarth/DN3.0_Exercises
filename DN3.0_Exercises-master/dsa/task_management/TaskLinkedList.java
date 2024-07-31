public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a task to the end of the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and return all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(int taskId) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
}
