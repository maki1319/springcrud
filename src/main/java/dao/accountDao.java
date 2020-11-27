package dao;

import domain.account;

import java.util.List;

public interface accountDao {
  List<account> findAll();
  account findAccountById(int id);
  void deleteAccount(int id);
  void updateAccount(account account1);
  void addAccount(account account1);
}
