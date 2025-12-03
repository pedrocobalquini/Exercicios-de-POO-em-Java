package model.entities;


public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
        super();
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        saqueValido(amount);
        balance -= amount;
    }

    private void saqueValido(double amount){
        if (amount > getWithdrawLimit())
            throw new IllegalArgumentException("The amount exceeds withdraw limit");
        if (amount > getBalance()) {
            throw new IllegalArgumentException("Not enough balance");
        }
    }

    @Override
    public String toString(){
        return "Novo saldo: " + balance;
    }
}
