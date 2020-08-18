package org.examlabs.oca1;

public class Q19CheckingAmount {
    public int amount;

    public Q19CheckingAmount(int x) {
        this.amount = x;
    }

    public static void main(String args[]) {
        Q19CheckingAmount acc = new Q19CheckingAmount((int) (Math.random() * 1000));
        acc.amount = 0;
        // acc.changeAmount(-acc.amount);
        //   acc.changeAmount(-acc.getAmount());
        System.out.println(acc.getAmount());

    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}

