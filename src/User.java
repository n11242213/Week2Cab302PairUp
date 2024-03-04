import java.util.ArrayList;

public class User {


    private String username;
    public String getUsername() {
        return username;
    }
    /*** Sets the username of the user.* @param username The username to set.*/
    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
    /*** Gets the password of the user.*/
    public String getPassword() {
        return password;
    }
    /*** Sets the password of the user.* @param password The password to set.*/
    public void setPassword(String password) {
        this.password = password;
    }

    private ArrayList<ToDoItem> toDoItems;
    /*** Gets the to-do items of the user. * @return A reference to the list of to-do items, which can be modified from outside the class.*/
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDoItems = new ArrayList<>();
    }

}