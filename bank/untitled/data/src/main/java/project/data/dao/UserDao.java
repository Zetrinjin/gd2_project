package project.data.dao;

import project.data.pojo.Cards;
import project.data.pojo.User;

public interface UserDao {
    void createUser(User user);
    User getUserById(String id);

    void updateUser(User user);

    boolean deleteUser(User user);
}
