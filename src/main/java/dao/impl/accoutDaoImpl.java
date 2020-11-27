package dao.impl;

import dao.accountDao;
import domain.account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import java.util.List;

public class accoutDaoImpl implements accountDao {
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<account> findAll() {
        try {

            return queryRunner.query("select * from account",new BeanListHandler<account>(account.class));

        }
        catch (Exception e){
          throw new RuntimeException(e);
        }

    }

    public account findAccountById(int id) {
        try {
            return queryRunner.query("select * from account where id=?",new BeanHandler<account>(account.class),id);

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public void deleteAccount(int id) {
        try {
         queryRunner.update("delete  from account where id=?",id);

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(account account1) {
        try {
            queryRunner.update("update account set name=?,price=? where id=?",account1.getName(),account1.getPrice(),account1.getID());

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void addAccount(account account1) {
        try {
            queryRunner.update("insert into account(name,price) values (?,?)",account1.getName(),account1.getPrice());

        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    }

