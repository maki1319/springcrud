import domain.account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.accountService;

import java.util.List;

public class crudTest {
    @Test
    public void findAll() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService as= ac.getBean("accountService",accountService.class);
        List<account>  list=as.findAll();
        for(account account:list){
            System.out.println(account);
        }
          
    }

    @Test
    public void findAccountById() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService as= ac.getBean("accountService",accountService.class);
        account account1=as.findAccountById(1);
        System.out.println(account1);

    }

    @Test
    public void saveAccount() {
        account account1=new account();
        account1.setName("ddd");
        account1.setPrice(1111);
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService as= ac.getBean("accountService",accountService.class);
        as.addAccount(account1);
    }

    @Test
    public void updateAccount() {
        account account1=new account();
        account1.setID(2);
        account1.setName("eee");
        account1.setPrice(2222);
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService as= ac.getBean("accountService",accountService.class);
        as.updateAccount(account1);
        findAll();
    }

    @Test
    public void deleteAccount() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService as= ac.getBean("accountService",accountService.class);
        as.deleteAccount(1);
        findAll();
    }

}
