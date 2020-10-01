package backend.domain.users;

public class AdminUser extends User {

    public AdminUser(String username, String password, String name, String email) {
        super(username, password, name, email);
    }

    public boolean userMatches(String username, String password) {
        return getUsername().equals(username) && getPassword().equals(password);
    }

}
