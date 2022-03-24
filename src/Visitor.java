import java.util.ArrayList;

class Visitor extends Users{
    String username;
    String password;
    final String userType = "Visitor";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Visitor(String username, String password) {
        this.username = username;
        this.password = password;
    }
}