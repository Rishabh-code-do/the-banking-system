package com.rishabh.the_banking_system.controller;

import com.itextpdf.text.DocumentException;
import com.rishabh.the_banking_system.entity.Transaction;
import com.rishabh.the_banking_system.service.BankStatement;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/bankStatement")
@AllArgsConstructor
public class TransactionController {
    @Autowired
    private BankStatement bankStatement;

    @GetMapping
    public List<Transaction> generateBankStatement(@RequestParam String accountNumber,@RequestParam String startDate,@RequestParam String endDate) throws DocumentException, FileNotFoundException {
        return bankStatement.generateStatement(accountNumber,startDate,endDate);
    }

}
