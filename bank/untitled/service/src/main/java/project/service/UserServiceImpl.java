package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.UserDao;
import project.data.model.UserDto;
import project.data.model.UserRole;
import project.data.pojo.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void registration(UserDto userDto) {

        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setRole(UserRole.ROLE_USER.toString());
        userDao.createUser(user);
    }
}
