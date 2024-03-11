import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
private ArrayList<User> users;
    public AuthenticationService(){
         users = new ArrayList<>();
        users.add(new User("Default","Default"));
    }





    public User signUp(String username, String password) {
        int ListSize = users.size() - 1;
        for (int i = 0; i <= ListSize; i++){
            User CurrentEntry = users.get(i);
            String CurrentUsername = CurrentEntry.getUsername();
            if(Objects.equals(username, CurrentUsername)){
                return null;

            }
        }
        User NewUser = new User(username, password);
        users.add(NewUser);
        return NewUser;
    }


    public User logIn(String username, String password) {
        int ListSize = users.size();
        for (int i = 0; i <= ListSize; i++){
            User CurrentEntry = users.get(i);
            String CurrentUsername = CurrentEntry.getUsername();
            String CurrentPassword = CurrentEntry.getPassword();
            if(CurrentUsername == username && CurrentPassword == password){
                return CurrentEntry;
            }
        }
        return null;
    }

    // TODO Now: Add a constructor to initialize the users list with the default user

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}
