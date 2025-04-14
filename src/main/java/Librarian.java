import java.util.Scanner;

public class Librarian {

    Scanner in = new Scanner(System.in);
    private String UserName ;
    private String Password;
    public Librarian(String userName,String password){
        this.UserName = userName;
        this.Password = password;
    }

    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
