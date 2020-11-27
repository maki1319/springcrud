package service.impl;


import dao.accountDao;
import domain.account;
import service.accountService;

import java.util.List;

public class accoutServiceImpl  implements accountService

{
  private accountDao accoutDao1;

    public void setAccoutDao1(accountDao accoutDao1) {
        this.accoutDao1 = accoutDao1;
    }

    public List<account> findAll() {
        return accoutDao1.findAll();
    }

    public account findAccountById(int id) {
        return accoutDao1.findAccountById(id);
    }

    public void deleteAccount(int id) {
     accoutDao1.deleteAccount(id);
    }

    public void updateAccount(account account1) {
       accoutDao1.updateAccount(account1);
    }

    public void addAccount(account account1) {
          accoutDao1.addAccount(account1);
    }
}
