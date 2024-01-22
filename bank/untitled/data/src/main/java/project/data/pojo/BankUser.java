package project.data.pojo;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t_user")
public class BankUser {
    @Id
    @GenericGenerator(strategy = "uuid", name = "bank_uuid")
    @GeneratedValue(generator = "bank_uuid")
    @Column(name = "user_id")
    private String id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "user_role")
    private String role;

    @OneToMany(mappedBy = "bankUser", cascade = CascadeType.ALL)
    private List<Account> accounts;

    /*@OneToMany(mappedBy = "bankUser")
    private List<Credit> credits;*/

    public BankUser() {
    }


    public BankUser(String id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /*public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankUser bankUser = (BankUser) o;
        return id.equals(bankUser.id) && username.equals(bankUser.username) && password.equals(bankUser.password) && role.equals(bankUser.role) && Objects.equals(accounts, bankUser.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, role, accounts);
    }
}
