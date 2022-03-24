import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String auth = "unauthorized";
        ArrayList<Task> taskList = new ArrayList<>();
        HashMap<String, String> userList = new HashMap<>();

        taskDaoImpl taskdao = new taskDaoImpl(taskList);
        userDaoImpl userdao = new userDaoImpl();
        int choice1, user;
        System.out.println("1.Login" +
                "\n 2.Register");
        choice1 = sc.nextInt();
        if (choice1 == 1) {
            auth = userdao.login();
        } else if (choice1 == 2) {
            userdao.register();
            auth = userdao.login();
        }
        //client login
        if (Objects.equals(auth, "client authorized")) {

            do {
                System.out.println("Select the operation you want to perform");
                System.out.println("****************************************");
                System.out.println();
                System.out.println("1.Add task");
                System.out.println("2.Update task");
                System.out.println("3.Delete task");
                System.out.println("4.Search task");
                System.out.println("5.Assign user");
                System.out.println("0.Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> taskdao.addTask();
                    case 2 -> taskdao.updateTask();
                    case 3 -> taskdao.deleteTask();
                    case 4 -> taskdao.searchTask();
                    case 5 -> taskdao.assignTask();
                }
            } while (choice != 0);
        }

        else if(Objects.equals(auth,"visitor authorized")){
            System.out.println("Enter username again");
            String username = sc.next();
            userdao.displayTasks(username);
        }
        else
            System.out.println("wrong username or password");

    }
    }