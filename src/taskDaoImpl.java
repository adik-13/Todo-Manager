import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class taskDaoImpl implements taskDao {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Task> taskList = new ArrayList<>();
    int i=0;

    public taskDaoImpl(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public taskDaoImpl() {
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void addTask(){
        Task task = new Task();
        System.out.println("Enter the task title");
        task.setTaskTitle(sc.next());
        System.out.println("Enter the taskText");
        task.setTaskText(sc.next());
        System.out.println("Enter the user whom the task is assigned to");
        task.setAssignedTo(sc.next());
        taskList.add(task);
    }

    public void updateTask(){
        System.out.println("Enter the task name");
        String taskTitle = sc.next();
        int flag=0;
        for (Task task : taskList) {
            if (taskTitle.equalsIgnoreCase(task.getTaskTitle())) {
                System.out.println("Enter the text to update");
                task.setTaskTitle(sc.next());
                System.out.println("Updated");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Task not found");
    }

    public void deleteTask(){
        System.out.println("Enter the task name");
        String taskTitle = sc.next();
        int flag=0;
        for (Task task : taskList) {
            if (taskTitle.equalsIgnoreCase(task.getTaskTitle())) {
                taskList.remove(task);
                System.out.println("Deleted");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Task not found");
    }

    public void searchTask(){
        System.out.println("Enter the task name");
        String taskTitle = sc.next();
        int flag=0;
        for (Task task : taskList) {
            if (taskTitle.equalsIgnoreCase(task.getTaskTitle())) {
                System.out.println("Task found");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Task not found");
    }


    public void assignTask() {
        System.out.println("Enter task name");
        String taskTitle = sc.next();

    }
}
