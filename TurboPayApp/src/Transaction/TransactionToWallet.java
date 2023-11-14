package Transaction;

import API.DatabaseAPI;
import API.ValidatorAPI;
import AccountDatabaseManger.*;
import UserAccount.UserAccount;
import Validator.BankIdValidator;
import Validator.PhoneValidator;


public class TransactionToWallet implements Transaction{

    @Override
    public void transfer(int amount, UserAccount sender, String walletNo) {

        sender.setBalance(sender.getBalance() - amount);
        UserAccount receiverAccount = DatabaseAPI.accounts.returnAccountWithWalletNo(walletNo);
        if (receiverAccount != null){
            receiverAccount.setBalance(receiverAccount.getBalance() + amount);
        }
        System.out.println("Transaction Done!");

    }
}
