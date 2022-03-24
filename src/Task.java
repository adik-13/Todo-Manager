public class Task {
    private int taskid;
    private String taskTitle;
    private String taskText;
    private String assignedTo;

    @Override
    public String toString() {
        return "Task{" +
                "taskid=" + taskid +
                ", taskTitle='" + taskTitle + '\'' +
                ", taskText='" + taskText + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                '}';
    }

    public Task() {

    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Task(int taskid, String taskTitle, String taskText, String assignedTo) {
        this.taskid = taskid;
        this.taskTitle = taskTitle;
        this.taskText = taskText;
        this.assignedTo = assignedTo;
    }


}
