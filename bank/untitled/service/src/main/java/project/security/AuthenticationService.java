package project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import project.data.dao.BankUserDao;
import project.data.pojo.BankUser;

import java.util.List;

@SuppressWarnings({"unused"})
@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    BankUserDao bankUserDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            List<BankUser> appUsers = bankUserDao.findByUserName(username);
            if (appUsers.size() != 1) {
                throw new UsernameNotFoundException("BankUser not found: " + username);
            }
            BankUser appUser = appUsers.get(0);
            return new User(
                    appUser.getUserName(),
                    appUser.getPassword(),
                    true, true, true, true,
                    List.of(new SimpleGrantedAuthority(appUser.getRole()))
            );

        } catch (Exception e) {
            throw new UsernameNotFoundException("BankUser not found: " + username, e);
        }
    }
}

