package project.data.dao;

import project.data.pojo.BankUser;

import java.util.List;

public interface BankUserDao {
    void createUser(BankUser bankUser);
    BankUser getUserById(String id);

    void updateUser(BankUser bankUser);

    boolean deleteUser(BankUser bankUser);

    List<BankUser> getAllUsers();

    List<BankUser> findByUserName(String username);

    BankUser findByUserNameOne(String username);


}
