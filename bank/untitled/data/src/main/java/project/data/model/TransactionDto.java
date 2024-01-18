package project.data.model;

public class TransactionDto {

    private String id;

    private String transactionSum;

    private String cardSender;

    private String cardRecipient;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private BankUser user;*/

    public TransactionDto() {
    }

    public TransactionDto(String transactionId, String transactionSum, String cardSender, String cardRecipient) {
        this.id = transactionId;
        this.transactionSum = transactionSum;
        this.cardSender = cardSender;
        this.cardRecipient = cardRecipient;
    }

    public String getTransactionId() {
        return id;
    }

    public void setTransactionId(String transactionId) {
        this.id = transactionId;
    }

    public String getTransactionSum() {
        return transactionSum;
    }

    public void setTransactionSum(String transactionSum) {
        this.transactionSum = transactionSum;
    }

    public String getCardSender() {
        return cardSender;
    }

    public void setCardSender(String cardSender) {
        this.cardSender = cardSender;
    }

    public String getCardRecipient() {
        return cardRecipient;
    }

    public void setCardRecipient(String cardRecipient) {
        this.cardRecipient = cardRecipient;
    }

   /* public BankUser getUser() {
        return user;
    }

    public void setUser(BankUser user) {
        this.user = user;
    }*/
}
