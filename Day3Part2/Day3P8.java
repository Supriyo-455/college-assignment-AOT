package Day3Part2;

import java.util.Random;

public class Day3P8 {
    public static void main(String[] args) {
        SavingsAccount newAc = new SavingsAccount("Someone", 500, 0);
        CurrentAccount cAc = new CurrentAccount("Someone2", 1000, 1);

        System.out.println("For someone");
        System.out.println(newAc.accountNumber);
        System.out.println(newAc.customerName);
        System.out.println(newAc.balance);
        System.out.println(newAc.getAccountType());
        System.out.println(newAc.deposite(500));
        newAc.computeInterest();
        System.out.println(newAc.balance);

        System.out.println();

        System.out.println("For someone2");
        System.out.println(cAc.accountNumber);
        System.out.println(cAc.customerName);
        System.out.println(cAc.balance);
        System.out.println(cAc.getAccountType());
        System.out.println(cAc.deposite(500));
        System.out.println(cAc.withDraw(600));

    }
}

class Account {
    String customerName;
    int accountNumber;
    int type; // 0 == savings, 1 == current
    double balance = 0;

    Account(String name, int initialDepo, int type) {
        this.customerName = name;
        this.accountNumber = new Random().nextInt(1000000) + 99999;
        this.balance += initialDepo;
        this.type = type;
    }

    double deposite(int amount) {
        this.balance += amount;
        return this.balance;
    }

    double withDraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Don't have enough balance");
            return this.balance;
        }
        this.balance -= amount;
        return this.balance;
    }

    double getBalance() {
        return this.balance;
    }

    String getAccountType() {
        return (this.type == 0) ? "Savings" : "Current";
    }
}

class CurrentAccount extends Account {
    final int minBalance = 1000;

    CurrentAccount(String name, int initialDepo, int type) {
        super(name, initialDepo, type);
    }

    @Override
    double withDraw(int amount) {
        if (this.balance - amount < 1000) {
            penalty();
        }
        return super.withDraw(amount);
    }

    private void penalty() {
        System.out.println("Giving penalty of rs 100");
        this.balance -= 100;
    }
}

class SavingsAccount extends Account {
    double interestRate = 4;

    SavingsAccount(String name, int initialDepo, int type) {
        super(name, initialDepo, type);
    }

    void computeInterest() {
        double result = super.balance * Math.pow((1 + ((this.interestRate / 2)) / 100), 2);
        this.balance = result;
    }
}
