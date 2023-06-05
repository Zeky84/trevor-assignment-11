package com.codercampus.Assignment11.web;

import com.codercampus.Assignment11.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping("/transactions")
    public String allTransactions(ModelMap transactionsModel) {
        transactionsModel.put("transactions", transactionService.getAllTransactions());
        return "transactions";
    }

    @GetMapping("/transactions/{transactionId}")
    public String getTransaction(@PathVariable Long transactionId, ModelMap transactionModel) {
        transactionModel.put("transaction", transactionService.getTransaction(transactionId));
        return "transaction";
    }
}
