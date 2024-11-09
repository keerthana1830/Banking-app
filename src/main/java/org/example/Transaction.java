package org.example;

import java.time.LocalDateTime;

public class Transaction {
    private String transferredAmount;
    private LocalDateTime transactionDoneAt;
    private String transactionId;
    private Account transferredTo;
    private Account transferredFrom;

    public String getTransferredAmount() {
        return transferredAmount;
    }

    public void setTransferredAmount(String transferredAmount) {
        this.transferredAmount = transferredAmount;
    }

    public LocalDateTime getTransactionDoneAt() {
        return transactionDoneAt;
    }

    public void setTransactionDoneAt(LocalDateTime transactionDoneAt) {
        this.transactionDoneAt = transactionDoneAt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Account getTransferredTo() {
        return transferredTo;
    }

    public void setTransferredTo(Account transferredTo) {
        this.transferredTo = transferredTo;
    }

    public Account getTransferredFrom() {
        return transferredFrom;
    }

    public void setTransferredFrom(Account transferredFrom) {
        this.transferredFrom = transferredFrom;
    }
}
