package Transaction;

import API.DatabaseAPI;
import API.ValidatorAPI;
import UserAccount.UserAccount;
import Validator.BankIdValidator;


public class TransactionToBankAcc implements Transaction {
    @Override
    public void transfer(int amount, UserAccount sender, String bankID) {
        ValidatorAPI.validator = new BankIdValidator();
        if (sender.getBalance() < amount || !ValidatorAPI.validator.isValid(bankID)) {
            System.out.println("Cannot Transact!");
            return;
        }
        sender.setBalance(sender.getBalance() - amount);
        UserAccount receiverAccount = DatabaseAPI.accounts.returnAccountWithBankID(bankID);
        if (receiverAccount != null) {
            receiverAccount.setBalance(receiverAccount.getBalance() + amount);
        }
        System.out.println("Transaction Done!");

    }
}


