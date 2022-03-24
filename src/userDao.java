public interface userDao {
    void register();
    String login();
    String displayTasks(String username);
    void addUser();
    void removeUser();
}
