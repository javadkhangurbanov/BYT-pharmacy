package main.java.entities.users;

public abstract class User {
    protected Integer _id;
    protected String email;
    protected String password;
    protected String firstName;
    protected String surname;
    protected String phone;

    public boolean logOut() {
        return false;
    }
}
