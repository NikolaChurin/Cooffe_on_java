package PavelDz.Dz2;

public class Guest {
   private int balance;
   private String name;

    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    public Guest(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    public boolean zakazal( int price){
        if (balance-price>0) {
            return true;
        } else return false;
    };

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int sdacha(int x){
        return balance-x;
    }


}
