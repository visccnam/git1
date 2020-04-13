
package service;

import JDBCConnection.AccountMangement;
import java.util.List;
import model.Account;


public class AccountService {
    AccountMangement accountMangement;

    public AccountService() {
        accountMangement=new AccountMangement();
    }
    public List<Account> getAllAccount(){
        return accountMangement.getAllAccount();
    }
    public void addAccount(Account a){
        accountMangement.addAccount(a);
    }
    public void updateAccount(Account a){
        accountMangement.updateAccount(a);
    }
    public void napMoney(Account a,int money){
        accountMangement.napMoney(a, money);
    }
    public Account getAccount(String userName){
        return accountMangement.getAccount(userName);
        
    }
     
}
