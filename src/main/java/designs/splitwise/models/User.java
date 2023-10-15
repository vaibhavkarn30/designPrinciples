package designs.splitwise.models;

public class User {

    private int userId;
    private String name;
    private String phoneNumber;

    private String email;

    public User(int userId, String name, String phoneNumber, String email) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }



}
