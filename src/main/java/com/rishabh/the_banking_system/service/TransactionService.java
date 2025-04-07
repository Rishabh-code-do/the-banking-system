package com.rishabh.the_banking_system.service;

import com.rishabh.the_banking_system.dto.TransactionDto;
import com.rishabh.the_banking_system.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
