package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.BankUserDao;
import project.data.model.BankUserDto;
import project.data.model.UserRole;
import project.data.pojo.BankUser;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private BankUserDao bankUserDao;

    @Override
    public void registration(BankUserDto bankUserDto) {

        BankUser bankUser = new BankUser();
        bankUser.setUserName(bankUserDto.getUserName());
        bankUser.setPassword(bankUserDto.getPassword());
        bankUser.setRole(UserRole.USER.toString());
        bankUserDao.createUser(bankUser);
    }
}
