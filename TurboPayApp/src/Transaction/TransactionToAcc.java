package Transaction;

import API.DatabaseAPI;
import UserAccount.UserAccount;



public class TransactionToAcc implements Transaction {
    @Override
    public void transfer(int amount, UserAccount sender, String username) {

        if (sender.getBalance() < amount) {
            System.out.println("Balance is not enough");
            return;
        }
        UserAccount receiverAccount =  DatabaseAPI.accounts.returnAccountWithUsername(username);
        if (receiverAccount != null) {
            sender.setBalance(sender.getBalance() - amount);
            receiverAccount.setBalance(receiverAccount.getBalance() + amount);
            System.out.println("Transaction Done!");
            return;
        }
        System.out.println("User not found");

    }
}

