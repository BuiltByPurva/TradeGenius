package com.tradegenius.service;

import com.tradegenius.domain.WalletTransactionType;
import com.tradegenius.model.Wallet;
import com.tradegenius.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
