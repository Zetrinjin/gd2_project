package project.data.dao;

import project.data.pojo.Cards;
import project.data.pojo.Credit;

public interface CreditDao {

    void createCredit(Credit credit);
    Credit getCreditById(String id);

    void updateCredit(Credit credit);

    boolean deleteCredit(Credit credit);
}
