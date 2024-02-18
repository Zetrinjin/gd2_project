package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.ClientDao;
import project.data.model.ClientDto;
import project.data.model.UserRole;
import project.data.pojo.Client;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private ClientDao clientDao;

    @Override
    public void registration(ClientDto clientDto) {

        Client client = new Client();
        client.setUserName(clientDto.getUserName());
        client.setPassword(clientDto.getPassword());
        client.setRole(UserRole.ROLE_USER.toString());
        clientDao.createUser(client);
    }
}
