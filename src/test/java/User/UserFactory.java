package User;

/**
 * Created by UITS-Admin on 30.04.2017.
 */
public class UserFactory {

    public static User getValidUser(){
        return new User("mytest_test","3387774a","mytest_test@mail.ru");
    }
    public static User getNotValidUser(){
        return new User("mmm", "mmm", "mmm@mail.ru");
    }

}
