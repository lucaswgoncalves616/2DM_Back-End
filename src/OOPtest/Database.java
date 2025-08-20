package OOPtest;

public class Database {
    public User[] users;
    public int numOfUsers;

    Database() {
        users = new User[10];
        numOfUsers = 0;
    }

    public void registerUser(User user) {
        users[numOfUsers++] = user;
    }

    public void showInfo() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
