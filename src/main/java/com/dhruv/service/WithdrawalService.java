package com.dhruv.service;

import com.dhruv.model.User;
import com.dhruv.model.Withdrawal;
import lombok.With;

import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount,User user);
    Withdrawal procedWithdrawal(Long withdrawalId,boolean accept) throws Exception;
    List<Withdrawal> getUsersWithdrawalHistory(User user);
    List<Withdrawal> getAllWithdrawalRequest();
}
