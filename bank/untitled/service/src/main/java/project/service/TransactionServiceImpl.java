package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.data.dao.CardsDao;
import project.data.dao.TransactionDao;
import project.data.model.CardsDto;
import project.data.model.TransactionDto;
import project.data.pojo.Cards;
import project.data.pojo.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private CardsDao cardsDao;

    @Autowired
    private TransactionDao transactionDao;
    @Override
    public void getNewTransaction(TransactionDto transactionDto) {

        String cardNumSender = transactionDto.getCardSender();
        Cards cardsSender = cardsDao.getCardByNumber(cardNumSender);

        String cardNumRecipient= transactionDto.getCardRecipient();
        Cards cardsRecipient = cardsDao.getCardByNumber(cardNumRecipient);

        double newCardSenderSum = cardsSender.getCardBalance() - transactionDto.getTransactionSum();
        cardsSender.setCardBalance(newCardSenderSum);

        double newCardRecipientSum = cardsRecipient.getCardBalance() + transactionDto.getTransactionSum();
        cardsRecipient.setCardBalance(newCardRecipientSum);

        Transaction transaction= new Transaction();
        transaction.setCardSender(transactionDto.getCardSender());
        transaction.setCardRecipient(transactionDto.getCardRecipient());
        transaction.setTransactionSum(transactionDto.getTransactionSum());

        cardsDao.updateCard(cardsSender);
        cardsDao.updateCard(cardsRecipient);
        transactionDao.createTransaction(transaction);
    }
}
