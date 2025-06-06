package com.vti.service;

import com.vti.dto.TransactionsDTO;
import com.vti.dto.filter.TransactionFilter;
import com.vti.entity.Transactions;
import com.vti.form.UpdateTransactionForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITransactionService {
    List<TransactionsDTO> filterTransactions(TransactionFilter filter);

    Transactions createTransaction(TransactionsDTO transactionsDTO);

    boolean updateTransaction(Integer transactionID, UpdateTransactionForm updateTransactionForm);

    boolean deleteTransaction(List<Integer> transactionID);

    List<TransactionsDTO> getAllTransactions();

    Page<TransactionsDTO> getTransactions(Pageable pageable);

}
