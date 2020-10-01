package backend.domain.users;

public class BuyerUser extends User {

    public BuyerUser(String username, String password, String name, String email) {
        super(username, password, name, email);
    }

    public boolean userMatches(String username, String password) {
        return getUsername().equals(username) && getPassword().equals(password);
    }
}
