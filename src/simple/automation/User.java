package simple.automation;

import java.util.Arrays;
import java.util.List;

public class User {
    private String login;
    private String password;

    public List<String> users = Arrays.asList(
            "Simple Smith",
            "GwenSimp",
            "AraSiMpLeNaMe",
            "Simplen't task",
            "do you si mple?",
            "have a nice simplE",
            "Stan Swagger",
            "Shawn_simple");

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) return true;
        if(!(object instanceof User)) return false;

        return ((User)object).getLogin().equals(this.getLogin());
    }
}
