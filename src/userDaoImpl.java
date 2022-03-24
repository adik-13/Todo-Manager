import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class userDaoImpl implements userDao {
    Scanner sc = new Scanner(System.in);
    List<Client> clients = new ArrayList<>();
    List<Visitor> visitors = new ArrayList<>();
    ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public void register() {
        System.out.println("1.Client \n 2.Visitor");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter username : ");
            String username = sc.next();
            System.out.println("Enter password : ");
            String password = sc.next();

            Client[] client = new Client[10];
            for(int i=0;i<client.length;i++){
                if(client[i]!=null) {
                    client[i] = new Client(username, password);
                    clients.add(client[i]);
                }
            }

        }
        else if(choice==2){
            System.out.println("Enter username : ");
            String username = sc.next();
            System.out.println("Enter password : ");
            String password = sc.next();

            Visitor[] visitor = new Visitor[10];
            for(int i=0;i<visitor.length;i++){
                if(visitor[i]!=null) {
                    visitor[i] = new Visitor(username, password);
                    visitors.add(visitor[i]);
                }
            }
        }
    }

    @Override
    public String login() {
        System.out.println("1.Client \n 2.Visitor");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter username : ");
            String username = sc.next();
            System.out.println("Enter password : ");
            String password = sc.next();
            for (Client client : clients) {

                if (username.equalsIgnoreCase(client.getUsername()) && password.equalsIgnoreCase(client.getPassword())) {
                    return "client authorized";
                }
                else
                    return "unauthorized";
            }
        }
        if(choice==2){
            System.out.println("Enter username : ");
            String username = sc.next();
            System.out.println("Enter password : ");
            String password = sc.next();
            for (Visitor visitor : visitors) {

                if (username.equalsIgnoreCase(visitor.getUsername()) && password.equalsIgnoreCase(visitor.getPassword())) {
                    return "visitor authorized";
                }
                else
                    return "unauthorized";
            }
        }
        else
            return "Invalid option";
        return "check login function";
    }

    @Override
    public String displayTasks(String username) {
        for(Visitor visitor:visitors){
            if(Objects.equals(username, visitor.getUsername())){
                taskDaoImpl taskDao = new taskDaoImpl();
                tasks = taskDao.getTaskList();
                for(Task task:tasks){
                    if(Objects.equals(task.getAssignedTo(), username)){
                        return task.toString();
                    }
                    else
                        return "no tasks found";
                }
            }
            else
                return "no user found";
        }
        return null;
    }

    @Override
    public void addUser() {

    }

    @Override
    public void removeUser() {

    }
}
