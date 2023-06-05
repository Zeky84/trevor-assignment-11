package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll().stream()
                .sorted().collect(Collectors.toList());
    }

    public Transaction getTransaction(Long transactionId) {
        return transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getId()
                        .equals(transactionId)).findAny().get();


    }
}
