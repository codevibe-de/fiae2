package airline.auth;

import java.util.List;

public class AuthService {

    public void setCurrentUser(String username) {
    }


    // current user's permissions
    public List<String> getPermissions() {
        return List.of();
    }


    public void checkHasPermission(String permissionName) {
        if (!getPermissions().contains(permissionName)) {
            throw new IllegalStateException("not permitted");
        }
    }

}
