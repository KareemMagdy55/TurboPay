package Registration;

public class RegistrationFactory {
    public Registration makeRegistrationType(int accountType){
       if (accountType !=4) return new WalletAccRegistration();
       else return new BankAccRegistration();
    }
}
