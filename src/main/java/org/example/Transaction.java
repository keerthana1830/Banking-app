package org.example;

import java.time.LocalDateTime;

public class Transaction {
    private String transferredAmount;
    private LocalDateTime transactionDoneAt;
    private String transactionId;
    private Account transferredTo;
    private Account transferredFrom;

}
