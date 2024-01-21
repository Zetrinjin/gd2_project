package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.CreditDao;
import project.data.model.CreditDto;
import project.data.pojo.Credit;

@Service
public class CreditServiceImpl implements CreditService{

    @Autowired
    public CreditDao creditDao;
    @Override
    public void createNewCredit(CreditDto creditDto) {

        Credit credit =new Credit();
        credit.setSumCredit(creditDto.getSumCredit());
        credit.setCreditPercent(creditDto.getCreditPercent());
        creditDao.createCredit(credit);

    }
}
