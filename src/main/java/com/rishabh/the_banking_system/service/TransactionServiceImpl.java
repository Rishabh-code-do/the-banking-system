package com.rishabh.the_banking_system.service;

import com.rishabh.the_banking_system.dto.TransactionDto;
import com.rishabh.the_banking_system.entity.Transaction;
import com.rishabh.the_banking_system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;


    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }
}
