package service;

import domain.account;

import java.util.List;

public interface accountService {
    List<account> findAll();
    account findAccountById(int id);
    void deleteAccount(int id);
    void updateAccount(account account1);
    void addAccount(account account1);
}
