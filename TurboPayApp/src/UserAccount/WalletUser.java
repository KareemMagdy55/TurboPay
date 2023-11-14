package UserAccount;

public abstract class WalletUser extends UserAccount {
    String walletID;
    public abstract void  getWalletType();
    public String getWalletID() {
        return walletID;
    }

    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }
}
