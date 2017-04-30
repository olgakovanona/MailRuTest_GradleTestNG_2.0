package User;

/**
 * Created by UITS-Admin on 30.04.2017.
 */
public class User {
    public String login;
    public String password;
    public String mail;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public User(String login, String password, String mail) {
        this.login = login;
        this.password = password;
        this.mail = mail;
    }
}
