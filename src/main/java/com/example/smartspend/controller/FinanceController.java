package com.example.smartspend.controller;

import com.example.smartspend.model.Transaction;
import com.example.smartspend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class FinanceController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getAllTransactions(@RequestHeader("userId") Long userId) {
        return transactionRepository.findAllByUserIdOrderByDateDesc(userId);
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction, @RequestHeader("userId") Long userId) {
        if(transaction.getDate() == null) {
            transaction.setDate(java.time.LocalDate.now());
        }
        transaction.setUserId(userId);
        return transactionRepository.save(transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionRepository.deleteById(id);
    }
}
