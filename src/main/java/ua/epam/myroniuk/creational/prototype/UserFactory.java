package ua.epam.myroniuk.creational.prototype;

/**
 * Created by Vitalii on 07.08.2017.
 */
public class UserFactory {
    private User user;

    public UserFactory(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User cloneUser() {
        return (User) user.copy();
    }
}
