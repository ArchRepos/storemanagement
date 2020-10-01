package backend.interfaces;

import backend.domain.users.User;

public interface UserControls {

    public void register(User user);
    public boolean login(String username, String password);
}
